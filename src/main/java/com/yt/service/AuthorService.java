package com.yt.service;

import com.jfinal.kit.Kv;
import com.yt.base.BaseService;
import com.yt.bean.DetailMusicEntity;
import com.yt.model.Authorlist;
import com.yt.utils.NetKit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorService extends BaseService<Authorlist> {

    public List<Authorlist> getList() {
        return Authorlist.dao.findAll();
    }





}
