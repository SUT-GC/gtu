package com.igouc.gtuapi.dto;

import com.alibaba.fastjson.JSONObject;

public class GtuGaoxiaoFenshuDTO {
    private Integer id;
    private String daXueMing;
    private String zhaoShengQu;
    private String keBie;
    private String nianFen;
    private String piCi;
    private String pingJunFen;
    private String kongFenXian;
    private String xianCha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDaXueMing() {
        return daXueMing;
    }

    public void setDaXueMing(String daXueMing) {
        this.daXueMing = daXueMing;
    }

    public String getZhaoShengQu() {
        return zhaoShengQu;
    }

    public void setZhaoShengQu(String zhaoShengQu) {
        this.zhaoShengQu = zhaoShengQu;
    }

    public String getKeBie() {
        return keBie;
    }

    public void setKeBie(String keBie) {
        this.keBie = keBie;
    }

    public String getNianFen() {
        return nianFen;
    }

    public void setNianFen(String nianFen) {
        this.nianFen = nianFen;
    }

    public String getPiCi() {
        return piCi;
    }

    public void setPiCi(String piCi) {
        this.piCi = piCi;
    }

    public String getPingJunFen() {
        return pingJunFen;
    }

    public void setPingJunFen(String pingJunFen) {
        this.pingJunFen = pingJunFen;
    }

    public String getKongFenXian() {
        return kongFenXian;
    }

    public void setKongFenXian(String kongFenXian) {
        this.kongFenXian = kongFenXian;
    }

    public String getXianCha() {
        return xianCha;
    }

    public void setXianCha(String xianCha) {
        this.xianCha = xianCha;
    }

    @Override
    public String toString() {
        return "GtuGaoxiaoFenshuDTO{" +
                "id=" + id +
                ", daXueMing='" + daXueMing + '\'' +
                ", zhaoShengQu='" + zhaoShengQu + '\'' +
                ", keBie='" + keBie + '\'' +
                ", nianFen='" + nianFen + '\'' +
                ", piCi='" + piCi + '\'' +
                ", pingJunFen='" + pingJunFen + '\'' +
                ", kongFenXian='" + kongFenXian + '\'' +
                ", xianCha='" + xianCha + '\'' +
                '}';
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
