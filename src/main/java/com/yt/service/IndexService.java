package com.yt.service;

import com.jfinal.kit.Kv;
import com.yt.base.BaseService;
import com.yt.bean.DetailMusicEntity;
import com.yt.bean.SongEntity;
import com.yt.model.User;
import com.yt.utils.NetKit;

import java.util.HashMap;
import java.util.Map;

public class IndexService extends BaseService<User> {


    public User toLogin(String admin, String pass) {

        return User.dao.findFirst("SELECT * " +
                "FROM user " +
                "WHERE user_admin=? " +
                "AND user_pass=? LIMIT 1", admin, pass);
    }

    public Kv getMusicInfo(String type, Integer type_of_id) {

        Map<String, Object> musicMap = new HashMap<>();

        musicMap.put("type", type);
        musicMap.put("id", type_of_id);

        DetailMusicEntity detail = NetKit.INSTANCE.getMusic(musicMap, DetailMusicEntity.class);

        return Kv.create().set("bean", detail).set("type", type).set("type_of_id", type_of_id);

    }

    public String getMusicId(Integer id) {

        Map<String, Object> musicMap = new HashMap<>();

        musicMap.put("type", "song");
        musicMap.put("id", id);

        SongEntity songEntity = NetKit.INSTANCE.getMusic(musicMap, SongEntity.class);

        if (songEntity == null)
            return "";

        return songEntity.getData().isEmpty() ? "" : songEntity.getData().get(0).getUrl();


    }


}
