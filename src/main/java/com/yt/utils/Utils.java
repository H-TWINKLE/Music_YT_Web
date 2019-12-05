package com.yt.utils;

import com.jfinal.kit.LogKit;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public enum Utils {
    INSTANCE;

    public void printHeader(HttpServletRequest httpServletRequest) {

        Enumeration<String> e = httpServletRequest.getHeaderNames();

        while (e.hasMoreElements()) {

            String name = e.nextElement();

            LogKit.info(name + " : " + httpServletRequest.getHeader(name));
        }
    }

}
