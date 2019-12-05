package com.yt.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.yt.base.BaseController;
import com.yt.model.User;

import static com.yt.base.BaseController._USER;

public class GlobalInterceptor implements Interceptor {


    @Override
    public void intercept(Invocation invocation) {

        User user = invocation.getController().getSessionAttr(_USER);

        if (user == null) {
            invocation.getController().forwardAction("/login");
            invocation.getController().set(BaseController._TIP, "请登录再进行操作！");
        } else {
            invocation.invoke();
        }


    }

}
