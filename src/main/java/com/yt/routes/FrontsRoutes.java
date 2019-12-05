package com.yt.routes;

import com.jfinal.config.Routes;
import com.yt.controller.AuthController;
import com.yt.controller.AuthorController;
import com.yt.controller.IndexController;
import com.yt.controller.PlayListController;

public class FrontsRoutes extends Routes {


    @Override
    public void config() {

        add("/", IndexController.class, "/page/front");
        add("/author", AuthorController.class, "/page/front/author");
        add("/playlist", PlayListController.class, "/page/front/playlist");


        add("/auth", AuthController.class);

    }


}
