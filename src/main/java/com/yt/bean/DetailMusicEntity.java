package com.yt.bean;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class DetailMusicEntity {


    /**
     * songs : [{"name":"世间美好与你环环相扣","id":1363948882,"pst":0,"t":0,"ar":[{"id":31876221,"name":"柏松","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":8,"v":16,"crbt":null,"cf":"","al":{"id":78938226,"name":"听闻余生","picUrl":"https://p2.music.126.net/DK1_4sP_339o5rowMdPXdw==/109951164071024476.jpg","tns":[],"pic_str":"109951164071024476","pic":109951164071024476},"dt":191960,"h":{"br":320000,"fid":0,"size":7681089,"vd":-37574},"m":{"br":192000,"fid":0,"size":4608671,"vd":-34959},"l":{"br":128000,"fid":0,"size":3072462,"vd":-33277},"a":null,"cd":"01","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mark":0,"mv":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"publishTime":0}]
     * privileges : [{"id":1363948882,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":64,"preSell":false}]
     * code : 200
     */

    private Integer code;
    private List<SongsBean> songs;
    private List<PrivilegesBean> privileges;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<SongsBean> getSongs() {
        return songs;
    }

    public void setSongs(List<SongsBean> songs) {
        this.songs = songs;
    }

    public List<PrivilegesBean> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<PrivilegesBean> privileges) {
        this.privileges = privileges;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

    public static class SongsBean {
        /**
         * name : 世间美好与你环环相扣
         * id : 1363948882
         * pst : 0
         * t : 0
         * ar : [{"id":31876221,"name":"柏松","tns":[],"alias":[]}]
         * alia : []
         * pop : 100.0
         * st : 0
         * rt :
         * fee : 8
         * v : 16
         * crbt : null
         * cf :
         * al : {"id":78938226,"name":"听闻余生","picUrl":"https://p2.music.126.net/DK1_4sP_339o5rowMdPXdw==/109951164071024476.jpg","tns":[],"pic_str":"109951164071024476","pic":109951164071024476}
         * dt : 191960
         * h : {"br":320000,"fid":0,"size":7681089,"vd":-37574}
         * m : {"br":192000,"fid":0,"size":4608671,"vd":-34959}
         * l : {"br":128000,"fid":0,"size":3072462,"vd":-33277}
         * a : null
         * cd : 01
         * no : 1
         * rtUrl : null
         * ftype : 0
         * rtUrls : []
         * djId : 0
         * copyright : 0
         * s_id : 0
         * mark : 0
         * mv : 0
         * mst : 9
         * cp : 0
         * rtype : 0
         * rurl : null
         * publishTime : 0
         */

        private String name;
        private Integer id;
        private Integer pst;
        private Integer t;
        private double pop;
        private Integer st;
        private String rt;
        private Integer fee;
        private Integer v;
        private Object crbt;
        private String cf;
        private AlBean al;
        private Integer dt;
        private HBean h;
        private MBean m;
        private LBean l;
        private Object a;
        private String cd;
        private Integer no;
        private Object rtUrl;
        private Integer ftype;
        private Integer djId;
        private Integer copyright;
        private Integer s_id;
        private Integer mark;
        private Integer mv;
        private Integer mst;
        private Integer cp;
        private Integer rtype;
        private Object rurl;
        private Long publishTime;
        private List<ArBean> ar;
        private List<?> alia;
        private List<?> rtUrls;

        @Override
        public String toString() {
            return JSONObject.toJSONString(this);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getPst() {
            return pst;
        }

        public void setPst(Integer pst) {
            this.pst = pst;
        }

        public Integer getT() {
            return t;
        }

        public void setT(Integer t) {
            this.t = t;
        }

        public double getPop() {
            return pop;
        }

        public void setPop(double pop) {
            this.pop = pop;
        }

        public Integer getSt() {
            return st;
        }

        public void setSt(Integer st) {
            this.st = st;
        }

        public String getRt() {
            return rt;
        }

        public void setRt(String rt) {
            this.rt = rt;
        }

        public Integer getFee() {
            return fee;
        }

        public void setFee(Integer fee) {
            this.fee = fee;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }

        public Object getCrbt() {
            return crbt;
        }

        public void setCrbt(Object crbt) {
            this.crbt = crbt;
        }

        public String getCf() {
            return cf;
        }

        public void setCf(String cf) {
            this.cf = cf;
        }

        public AlBean getAl() {
            return al;
        }

        public void setAl(AlBean al) {
            this.al = al;
        }

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public HBean getH() {
            return h;
        }

        public void setH(HBean h) {
            this.h = h;
        }

        public MBean getM() {
            return m;
        }

        public void setM(MBean m) {
            this.m = m;
        }

        public LBean getL() {
            return l;
        }

        public void setL(LBean l) {
            this.l = l;
        }

        public Object getA() {
            return a;
        }

        public void setA(Object a) {
            this.a = a;
        }

        public String getCd() {
            return cd;
        }

        public void setCd(String cd) {
            this.cd = cd;
        }

        public Integer getNo() {
            return no;
        }

        public void setNo(Integer no) {
            this.no = no;
        }

        public Object getRtUrl() {
            return rtUrl;
        }

        public void setRtUrl(Object rtUrl) {
            this.rtUrl = rtUrl;
        }

        public Integer getFtype() {
            return ftype;
        }

        public void setFtype(Integer ftype) {
            this.ftype = ftype;
        }

        public Integer getDjId() {
            return djId;
        }

        public void setDjId(Integer djId) {
            this.djId = djId;
        }

        public Integer getCopyright() {
            return copyright;
        }

        public void setCopyright(Integer copyright) {
            this.copyright = copyright;
        }

        public Integer getS_id() {
            return s_id;
        }

        public void setS_id(Integer s_id) {
            this.s_id = s_id;
        }

        public Integer getMark() {
            return mark;
        }

        public void setMark(Integer mark) {
            this.mark = mark;
        }

        public Integer getMv() {
            return mv;
        }

        public void setMv(Integer mv) {
            this.mv = mv;
        }

        public Integer getMst() {
            return mst;
        }

        public void setMst(Integer mst) {
            this.mst = mst;
        }

        public Integer getCp() {
            return cp;
        }

        public void setCp(Integer cp) {
            this.cp = cp;
        }

        public Integer getRtype() {
            return rtype;
        }

        public void setRtype(Integer rtype) {
            this.rtype = rtype;
        }

        public Object getRurl() {
            return rurl;
        }

        public void setRurl(Object rurl) {
            this.rurl = rurl;
        }

        public Long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(Long publishTime) {
            this.publishTime = publishTime;
        }

        public List<ArBean> getAr() {
            return ar;
        }

        public void setAr(List<ArBean> ar) {
            this.ar = ar;
        }

        public List<?> getAlia() {
            return alia;
        }

        public void setAlia(List<?> alia) {
            this.alia = alia;
        }

        public List<?> getRtUrls() {
            return rtUrls;
        }

        public void setRtUrls(List<?> rtUrls) {
            this.rtUrls = rtUrls;
        }

        public static class AlBean {
            /**
             * id : 78938226
             * name : 听闻余生
             * picUrl : https://p2.music.126.net/DK1_4sP_339o5rowMdPXdw==/109951164071024476.jpg
             * tns : []
             * pic_str : 109951164071024476
             * pic : 109951164071024476
             */

            @Override
            public String toString() {
                return JSONObject.toJSONString(this);
            }

            private Integer id;
            private String name;
            private String picUrl;
            private String pic_str;
            private long pic;
            private List<?> tns;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getPic_str() {
                return pic_str;
            }

            public void setPic_str(String pic_str) {
                this.pic_str = pic_str;
            }

            public long getPic() {
                return pic;
            }

            public void setPic(long pic) {
                this.pic = pic;
            }

            public List<?> getTns() {
                return tns;
            }

            public void setTns(List<?> tns) {
                this.tns = tns;
            }
        }

        public static class HBean {
            /**
             * br : 320000
             * fid : 0
             * size : 7681089
             * vd : -37574.0
             */

            @Override
            public String toString() {
                return JSONObject.toJSONString(this);
            }

            private Integer br;
            private Integer fid;
            private Integer size;
            private double vd;

            public Integer getBr() {
                return br;
            }

            public void setBr(Integer br) {
                this.br = br;
            }

            public Integer getFid() {
                return fid;
            }

            public void setFid(Integer fid) {
                this.fid = fid;
            }

            public Integer getSize() {
                return size;
            }

            public void setSize(Integer size) {
                this.size = size;
            }

            public double getVd() {
                return vd;
            }

            public void setVd(double vd) {
                this.vd = vd;
            }
        }

        public static class MBean {
            /**
             * br : 192000
             * fid : 0
             * size : 4608671
             * vd : -34959.0
             */

            private Integer br;
            private Integer fid;
            private Integer size;
            private double vd;

            public Integer getBr() {
                return br;
            }

            public void setBr(Integer br) {
                this.br = br;
            }

            public Integer getFid() {
                return fid;
            }

            public void setFid(Integer fid) {
                this.fid = fid;
            }

            public Integer getSize() {
                return size;
            }

            public void setSize(Integer size) {
                this.size = size;
            }

            public double getVd() {
                return vd;
            }

            public void setVd(double vd) {
                this.vd = vd;
            }
        }

        public static class LBean {
            /**
             * br : 128000
             * fid : 0
             * size : 3072462
             * vd : -33277.0
             */

            @Override
            public String toString() {
                return JSONObject.toJSONString(this);
            }

            private Integer br;
            private Integer fid;
            private Integer size;
            private double vd;

            public Integer getBr() {
                return br;
            }

            public void setBr(Integer br) {
                this.br = br;
            }

            public Integer getFid() {
                return fid;
            }

            public void setFid(Integer fid) {
                this.fid = fid;
            }

            public Integer getSize() {
                return size;
            }

            public void setSize(Integer size) {
                this.size = size;
            }

            public double getVd() {
                return vd;
            }

            public void setVd(double vd) {
                this.vd = vd;
            }
        }

        public static class ArBean {
            /**
             * id : 31876221
             * name : 柏松
             * tns : []
             * alias : []
             */

            @Override
            public String toString() {
                return JSONObject.toJSONString(this);
            }

            private Integer id;
            private String name;
            private List<?> tns;
            private List<?> alias;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<?> getTns() {
                return tns;
            }

            public void setTns(List<?> tns) {
                this.tns = tns;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }
        }
    }

    public static class PrivilegesBean {
        /**
         * id : 1363948882
         * fee : 8
         * payed : 0
         * st : 0
         * pl : 128000
         * dl : 0
         * sp : 7
         * cp : 1
         * subp : 1
         * cs : false
         * maxbr : 999000
         * fl : 128000
         * toast : false
         * flag : 64
         * preSell : false
         */

        private Integer id;
        private Integer fee;
        private Integer payed;
        private Integer st;
        private Integer pl;
        private Integer dl;
        private Integer sp;
        private Integer cp;
        private Integer subp;
        private boolean cs;
        private Integer maxbr;
        private Integer fl;
        private boolean toast;
        private Integer flag;
        private boolean preSell;

        @Override
        public String toString() {
            return JSONObject.toJSONString(this);
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getFee() {
            return fee;
        }

        public void setFee(Integer fee) {
            this.fee = fee;
        }

        public Integer getPayed() {
            return payed;
        }

        public void setPayed(Integer payed) {
            this.payed = payed;
        }

        public Integer getSt() {
            return st;
        }

        public void setSt(Integer st) {
            this.st = st;
        }

        public Integer getPl() {
            return pl;
        }

        public void setPl(Integer pl) {
            this.pl = pl;
        }

        public Integer getDl() {
            return dl;
        }

        public void setDl(Integer dl) {
            this.dl = dl;
        }

        public Integer getSp() {
            return sp;
        }

        public void setSp(Integer sp) {
            this.sp = sp;
        }

        public Integer getCp() {
            return cp;
        }

        public void setCp(Integer cp) {
            this.cp = cp;
        }

        public Integer getSubp() {
            return subp;
        }

        public void setSubp(Integer subp) {
            this.subp = subp;
        }

        public boolean isCs() {
            return cs;
        }

        public void setCs(boolean cs) {
            this.cs = cs;
        }

        public Integer getMaxbr() {
            return maxbr;
        }

        public void setMaxbr(Integer maxbr) {
            this.maxbr = maxbr;
        }

        public Integer getFl() {
            return fl;
        }

        public void setFl(Integer fl) {
            this.fl = fl;
        }

        public boolean isToast() {
            return toast;
        }

        public void setToast(boolean toast) {
            this.toast = toast;
        }

        public Integer getFlag() {
            return flag;
        }

        public void setFlag(Integer flag) {
            this.flag = flag;
        }

        public boolean isPreSell() {
            return preSell;
        }

        public void setPreSell(boolean preSell) {
            this.preSell = preSell;
        }
    }
}
