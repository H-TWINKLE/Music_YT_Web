package com.yt.controller;

import com.jfinal.aop.Inject;
import com.jfinal.kit.Kv;
import com.jfinal.kit.LogKit;
import com.yt.base.BaseController;
import com.yt.bean.AuthorEntity;
import com.yt.bean.PlayListEntity;
import com.yt.service.AuthorService;

public class AuthorController extends BaseController {

    @Inject
    AuthorService authorService;

    public void index() {

        setTitle("歌手列表");

        setPlayList(authorService);

        set("authorList", authorService.getList());

        render("index.html");

    }

    public void detailAuthor(Integer id) {

        setTitle("歌手详细");

        Kv kv = authorService.getByTypesAndId("artist", id, AuthorEntity.class);

        setAuthorPlayList(kv);

        render("detailAuthor.html");

    }


    private void setAuthorPlayList(Kv kv) {

        set(_PLAY_LIST, kv);

        if (kv == null)
            return;

        AuthorEntity a = kv.getAs("bean");

        StringBuilder s = new StringBuilder();

        s.append("[ ");

        int x = 0;

        for (AuthorEntity.HotSongsBean t : a.getHotSongs()) {

            modelStringOfList(s,t.getName(),t.getAr().get(0).getName(),t.getId(),t.getAl().getPicUrl());

            if (x < a.getHotSongs().size() - 1) {
                s.append(",");
            } else {
                s.append("] ");
            }
            x++;
        }


        set(_REAL_PLAY_LIST, s.toString());


    }


}
