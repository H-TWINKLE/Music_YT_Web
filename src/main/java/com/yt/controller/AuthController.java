package com.yt.controller;

import com.jfinal.aop.Before;
import com.jfinal.aop.Inject;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.yt.base.BaseController;
import com.yt.interceptor.GlobalInterceptor;
import com.yt.model.Comment;
import com.yt.model.User;
import com.yt.service.UserService;

import java.util.Date;

@Before(GlobalInterceptor.class)
public class AuthController extends BaseController {

    @Inject
    UserService userService;


    public void toComment(String what, Long id) {

        String refer = "/detailMusic/?playListId=" + id;

        if (StrKit.isBlank(what)) {
            forwardActionWithTip(refer, "请填写评论！");
            return;
        }

        User user = getUser();

        if (user == null) {
            forwardActionWithTip("/index", "请登录！");
            return;
        }

        Comment comment = new Comment()
                .setCommentContent(what)
                .setCommentDate(new Date())
                .setCommentUser(user.getUserId())
                .setCommentPlaylist(id);

        if (comment.save()) {
            setTip("评论成功！");
        } else {
            setTip("评论失败！");
        }

        forwardAction(refer);

    }


    public void info() {

        setTitle("个人信息");

        setPlayList(userService);

        render("/page/front/info/info.html");

    }


    public void update() {

        User user = getModel(User.class, "u");

        user.setUserId(getUser().getUserId());

        user.update();

        setUser(user);

        forwardActionWithTip("/auth/info", "操作成功！");

    }

    public void admin() {

        setTitle("添加");

        setPlayList(userService);

        render("/page/front/info/add.html");
    }

    public void add(String sele, Long id, String name, String pic) {

        Record record = new Record();

        if ("gs".equals(sele)) {
            record.set("authorlist_user", id)
                    .set("authorlist_name", name)
                    .set("authorlist_pic", pic)
                    .set("authorlist_date", new Date());
            Db.save("authorlist", record);
        }

        if ("gd".equals(sele)) {
            record.set("playlist_user", id)
                    .set("playlist_name", name)
                    .set("playlist_pic", pic)
                    .set("playlist_date", new Date());
            Db.save("playlist", record);
        }

        forwardActionWithTip("/auth/admin","操作成功！");

    }


}
