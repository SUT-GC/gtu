package com.igouc.service.bo;

public class GaoXiaoXinXiBo {
    private String gaoXiaoMing;
    private String gaoXiaoUrl;

    public String getGaoXiaoMing() {
        return gaoXiaoMing;
    }

    public void setGaoXiaoMing(String gaoXiaoMing) {
        this.gaoXiaoMing = gaoXiaoMing;
    }

    public String getGaoXiaoUrl() {
        return gaoXiaoUrl;
    }

    public void setGaoXiaoUrl(String gaoXiaoUrl) {
        this.gaoXiaoUrl = gaoXiaoUrl;
    }

    @Override
    public String toString() {
        return "GaoXiaoXinXiBo{" +
                "gaoXiaoMing='" + gaoXiaoMing + '\'' +
                ", gaoXiaoUrl='" + gaoXiaoUrl + '\'' +
                '}';
    }
}
