package com.yt.config;

import com.alibaba.druid.filter.stat.StatFilter;
import com.jfinal.config.*;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.json.MixedJsonFactory;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;
import com.yt.interceptor.GlobalInterceptor;
import com.yt.model._MappingKit;
import com.yt.routes.FrontsRoutes;

import java.io.File;

public class MainConfig extends JFinalConfig {

    private static int isPro = 0;

    private static final String LOCAL_PATH = "E:\\MyMajor\\myeclipse\\Dy_Law\\src\\main\\webapp\\upload";

    //private static final String CONTEXT_VALUE = "/Music_YT";

    private static final String CONTEXT_VALUE = "/";

    private static final String CONFIG_FILE_NAME = "config-dev.properties";

    @Override
    public void configConstant(Constants me) {

        PropKit.use(CONFIG_FILE_NAME);

        if (isProEnviron()) {
            PropKit.appendIfExists("config-pro.properties");
        }

        me.setDevMode(PropKit.getBoolean("devMode"));
        me.setInjectDependency(true);

        me.setBaseUploadPath("upload/temp/");


        me.setMaxPostSize(1024 * 1024 * 1024);
        me.setBaseDownloadPath("download");
        me.setViewType(ViewType.JFINAL_TEMPLATE);

        me.setError404View("/page/_comm404.html");
        me.setError500View("/page/_comm500.html");

        me.setJsonFactory(MixedJsonFactory.me());


    }

    @Override
    public void configRoute(Routes me) {

        me.add(new FrontsRoutes());


    }

    /**
     * 配置JFinal插件 数据库连接池 ORM 缓存等插件 自定义插件
     */
    @Override
    public void configPlugin(Plugins me) {

        DruidPlugin dbPlugin = new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"),
                PropKit.get("password"));


        StatFilter set = new StatFilter();
        set.setLogSlowSql(true);

        dbPlugin.addFilter(set);
        dbPlugin.setDriverClass("com.mysql.jdbc.Driver");

        ActiveRecordPlugin arp = new ActiveRecordPlugin(dbPlugin);

        arp.setShowSql(PropKit.getBoolean("devMode"));
        arp.setDialect(new MysqlDialect());

        _MappingKit.mapping(arp);

        me.add(dbPlugin);
        me.add(arp);


    }

    /**
     * 配置全局拦截器
     */
    @Override
    public void configInterceptor(Interceptors me) {
        me.addGlobalActionInterceptor(new SessionInViewInterceptor());
        //me.add(new GlobalInterceptor());

    }

    /**
     * 配置全局处理器
     */
    @Override
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler("base"));
    }

    /**
     * 配置模板引擎
     */
    @Override
    public void configEngine(Engine me) {

        me.setDevMode(PropKit.getBoolean("devMode"));

        me.addSharedObject("host", PropKit.get("host"));
        me.addSharedFunction("comm/baseLayout.html");

    }

    /**
     * 存在则为本地环境 返回 2 即false
     */
    public static boolean isProEnviron() {
        if (isPro == 0) {
            isPro = new File(LOCAL_PATH).exists() ? 2 : 1;
        }

        return isPro == 1;
    }


    public static void main(String[] args) {

        UndertowServer.create(MainConfig.class, CONFIG_FILE_NAME)
                .setContextPath(isProEnviron() ? CONTEXT_VALUE : "/").start();
    }


    @Override
    public void onStart() {
        super.onStart();
    }
}