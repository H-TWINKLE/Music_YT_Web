package com.yt.controller;


import com.jfinal.aop.Inject;
import com.yt.base.BaseController;
import com.yt.model.User;
import com.yt.service.IndexService;
import com.yt.str.Constants;

import java.util.Date;

public class IndexController extends BaseController {

    @Inject
    IndexService indexService;


    public void index() {

        setTitle("YT_音乐");

        setPlayList(indexService.getByTypesAndId("playlist", 3778678));

        set("newMusic", indexService.getByTypesAndId("playlist", 3779629));
        set("toTopMusic", indexService.getByTypesAndId("playlist", 19723756));

        render("index.html");
    }


    public void detailMusic(Long playListId) {

        setTitle("YT_歌单详情");

        playListId = getDefaultMusicPlayListId(playListId);

        setPlayList(indexService.getByTypesAndId("playlist", playListId));
        setComment(playListId);

        render("detail_music.html");
    }


    public void login() {

        setTitle("登录");
        render("login.html");
    }

    public void logOut() {

        removeSessionAttr(_USER);
        redirect("/index");
    }


    public void toLogin(String admin, String pass) {

        User user = indexService.toLogin(admin, pass);
        if (user == null) {
            forwardActionWithTip("/login", "用户名或者密码错误，请重试！");
            return;
        }

        setUser(user);
        redirect("/index");

    }


    public void toRegister() {

        User user = getModel(User.class, "u");

        if (user.getUserAdmin() == null) {
            forwardActionWithTip("/register", "请输入用户名！");
            return;
        }

        if (user.getUserPass() == null) {
            forwardActionWithTip("/register", "请输入密码！");
            return;
        }

        if (user.getUserName() == null) {
            forwardActionWithTip("/register", "请输入用户昵称！");
            return;
        }

        if (indexService.getUser(user.getUserAdmin()) != null) {
            forwardActionWithTip("/register", "该用户名已经注册，请重新输入！");
            return;
        }

        user.setUserRole(Constants.USER_PLATE_AS_USER);
        user.setUserCreateTime(new Date());
        user.setUserUpdateTime(new Date());

        indexService.save(user);
        forwardActionWithTip("/login", "注册成功，请登录!");

    }


    public void register() {

        setTitle("注册");
        render("register.html");
    }


    public void getMusicById(Integer id) {

        if (vailIdAsFail(id))
            return;

        redirect(indexService.getMusicId(id));

    }


}
