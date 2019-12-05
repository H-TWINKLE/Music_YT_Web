package com.yt.utils;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.kit.LogKit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.Map;

public enum NetKit {
    INSTANCE;

    private OkHttpClient okHttpClient = new OkHttpClient();

    public static final String _BASE_URL = "https://api.imjad.cn/cloudmusic/?";

    public <T> T getMusic(Map<String, Object> map, Class<T> c) {


        StringBuilder str = new StringBuilder();

        int num = 0;

        for (String s : map.keySet()) {
            str.append(s).append("=").append(map.get(s));

            if (num < map.keySet().size() - 1) {
                str.append("&");
            }
            num++;
        }

        String url = _BASE_URL + str.toString();

        LogKit.warn("getUrl: " + url);

        Request request = new Request.Builder().url(url).build();

        try (ResponseBody body = okHttpClient.newCall(request).execute().body()) {

            if (body == null)
                return null;

            String value = body.string();

            return JSONObject.parseObject(value, c);

        } catch (IOException e) {
            return null;
        }


    }


}
