package com.yt.controller;

import com.jfinal.aop.Inject;
import com.yt.base.BaseController;
import com.yt.service.PlayListService;

public class PlayListController extends BaseController {

    @Inject
    PlayListService playListService;


    public void index() {

        setTitle("歌单列表");

        setPlayList(playListService);

        set("playList", playListService.getList());

        render("index.html");

    }

    public void detailPlayList(Long id) {

        setTitle("歌单详细");

        setComment(id);
        setPlayList(playListService.getByTypesAndId("playlist", id));

        render("detailPlayList.html");

    }


}
