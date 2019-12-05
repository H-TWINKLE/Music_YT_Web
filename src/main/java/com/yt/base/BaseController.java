package com.yt.base;

import com.jfinal.core.Controller;
import com.jfinal.kit.Kv;
import com.jfinal.kit.StrKit;
import com.yt.bean.PlayListEntity;
import com.yt.model.Comment;
import com.yt.model.User;
import com.yt.str.Constants;

import java.util.List;

public class BaseController extends Controller {

    public static final String _USER = "user";

    public static final String _TITLE = "title";

    public static final String _TIP = "tip";

    public static final String _PLAY_LIST = "musicPlayList";

    public static final String _REAL_PLAY_LIST = "realMusicPlayList";

    protected void setTitle(String title) {
        if (StrKit.isBlank(title))
            return;

        set(_TITLE, title);
    }

    protected void setTip(String tip) {
        if (StrKit.isBlank(tip))
            return;

        set(_TIP, tip);
    }


    protected void setPlayList(Kv kv) {
        if (kv == null)
            return;

        set(_PLAY_LIST, kv);
        setRealPlayList(kv);
    }

    protected void setPlayList(BaseService basicService) {

        Kv kv = basicService.getByTypesAndId("playlist", 3778678);

        set(_PLAY_LIST, kv);
        setRealPlayList(kv);
    }

    protected void setRealPlayList(Kv kv) {
        if (kv == null)
            return;

        PlayListEntity playListEntity = kv.getAs("bean");

        StringBuilder s = new StringBuilder();

        s.append("[ ");

        int x = 0;

        for (PlayListEntity.PlaylistBean.TracksBean t : playListEntity.getPlaylist().getTracks()) {

            modelStringOfList(s, t.getName(), t.getAr().get(0).getName(), t.getId(), t.getAl().getPicUrl());

            /*s.append("{");
            s.append("title:'").append(t.getName()).append("',");
            s.append("artist:'").append(t.getAr().get(0).getName()).append("',");
            s.append("mp3:'").append("getMusicById?id=").append(t.getId()).append("',");
            s.append("poster:'").append(t.getAl().getPicUrl()).append("'");
            s.append(" }");*/

            if (x < playListEntity.getPlaylist().getTracks().size() - 1) {
                s.append(",");
            } else {
                s.append("] ");
            }
            x++;
        }


        set(_REAL_PLAY_LIST, s.toString());
    }


    public User getUser() {
        return getSessionAttr(_USER);
    }

    public void setUser(User user) {
        setSessionAttr(_USER, user);
    }


    public void forwardActionWithTip(String action, String tip) {
        setTip(tip);
        forwardAction(action);
    }

    protected Long getDefaultMusicPlayListId(Long playListId) {
        if (playListId == null || playListId == 0)
            return Constants.HOT_MUSIC_LIST;
        return playListId;
    }

    protected boolean vailIdAsFail(Integer id) {
        if (id == null || id == 0) {
            forwardActionWithTip("/index", "歌曲参数错误");
            return true;
        }

        return false;
    }


    protected void modelStringOfList(StringBuilder s, String title, String artist, Integer map3, String poster) {

        String base = getRequest().getContextPath();

        s.append("{");
        s.append("title:'").append(title).append("',");
        s.append("artist:'").append(artist).append("',");
        s.append("mp3:'").append(base).append("/getMusicById?id=").append(map3).append("',");
        s.append("poster:'").append(poster).append("'");
        s.append(" }");

    }

    public List<Comment> getAllCommentById(Long id) {
        if (id == null)
            return null;

        return Comment.dao.find(
                "SELECT * " +
                        "FROM comment " +
                        "LEFT JOIN user ON user_id=comment_user " +
                        "WHERE comment_playlist=? " +
                        "order by comment_date DESC", id);
    }


    protected void setComment(Long id) {
        set("comm", getAllCommentById(id));
    }


}
