package com.igouc.service.bo;

public class ZhuanYeXinXiBo {
    private String zhuanYeMing;
    private String zhuanYeUrl;

    public String getZhuanYeMing() {
        return zhuanYeMing;
    }

    public void setZhuanYeMing(String zhuanYeMing) {
        this.zhuanYeMing = zhuanYeMing;
    }

    public String getZhuanYeUrl() {
        return zhuanYeUrl;
    }

    public void setZhuanYeUrl(String zhuanYeUrl) {
        this.zhuanYeUrl = zhuanYeUrl;
    }

    @Override
    public String toString() {
        return "ZhuanYeXinXiBo{" +
                "zhuanYeMing='" + zhuanYeMing + '\'' +
                ", zhuanYeUrl='" + zhuanYeUrl + '\'' +
                '}';
    }
}
