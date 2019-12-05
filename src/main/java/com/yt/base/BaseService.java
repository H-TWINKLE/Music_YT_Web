package com.yt.base;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Model;
import com.yt.bean.PlayListEntity;
import com.yt.model.User;
import com.yt.utils.NetKit;

import java.util.HashMap;
import java.util.Map;

public class BaseService<T extends Model<T>> {

    public T save(T t) {
        t.save();
        return t;
    }

    public T update(T t) {
        t.update();
        return t;
    }

    public T DELETE(T t) {
        t.delete();
        return t;
    }

    public User getUser(String admin) {
        return User.dao.findFirst("SELECT * " +
                "FROM user " +
                "WHERE user_admin=? " +
                "LIMIT 1", admin);
    }

    public Kv getByTypesAndId(String type, Integer type_of_id) {

        Map<String, Object> indexMap = new HashMap<>();

        indexMap.put("type", /*"playlist"*/type);
        indexMap.put("id", /*19723756*/type_of_id);

        //offset 分页 0页
        //limit  每一页多少默认 10

        PlayListEntity playListEntity = NetKit.INSTANCE.getMusic(indexMap, PlayListEntity.class);

        return Kv.create().set("bean", playListEntity).set("type", type).set("type_of_id", type_of_id);

    }

    public Kv getByTypesAndId(String type, Long type_of_id) {

        Map<String, Object> indexMap = new HashMap<>();

        indexMap.put("type", /*"playlist"*/type);
        indexMap.put("id", /*19723756*/type_of_id);

        //offset 分页 0页
        //limit  每一页多少默认 10

        PlayListEntity playListEntity = NetKit.INSTANCE.getMusic(indexMap, PlayListEntity.class);

        return Kv.create().set("bean", playListEntity).set("type", type).set("type_of_id", type_of_id);

    }

    public <V> Kv getByTypesAndId(String type, Integer type_of_id, Class<V> t) {

        Map<String, Object> indexMap = new HashMap<>();

        indexMap.put("type", /*"playlist"*/type);
        indexMap.put("id", /*19723756*/type_of_id);

        //offset 分页 0页
        //limit  每一页多少默认 10

        V value = NetKit.INSTANCE.getMusic(indexMap, t);

        return Kv.create().set("bean", value).set("type", type).set("type_of_id", type_of_id);

    }


}
