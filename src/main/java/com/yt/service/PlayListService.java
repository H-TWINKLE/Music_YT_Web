package com.yt.service;

import com.yt.base.BaseService;
import com.yt.model.Authorlist;
import com.yt.model.Playlist;

import java.util.List;

public class PlayListService extends BaseService<Playlist> {

    public List<Playlist> getList() {
        return Playlist.dao.findAll();
    }


}
