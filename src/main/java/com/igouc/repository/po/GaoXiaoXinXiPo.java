package com.igouc.repository.po;

public class GaoXiaoXinXiPo {
    private String daXueMing;
    private String daxueUrl;

    public String getDaXueMing() {
        return daXueMing;
    }

    public void setDaXueMing(String daXueMing) {
        this.daXueMing = daXueMing;
    }

    public String getDaxueUrl() {
        return daxueUrl;
    }

    public void setDaxueUrl(String daxueUrl) {
        this.daxueUrl = daxueUrl;
    }

    @Override
    public String toString() {
        return "GaoXiaoXinXiPo{" +
                "daXueMing='" + daXueMing + '\'' +
                ", daxueUrl='" + daxueUrl + '\'' +
                '}';
    }
}
