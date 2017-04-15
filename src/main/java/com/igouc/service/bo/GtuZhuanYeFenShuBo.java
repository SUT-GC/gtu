package com.igouc.service.bo;

public class GtuZhuanYeFenShuBo {
    private Integer id;
    private String zhuanYeMing;
    private String daXueMing;
    private String pingJunFen;
    private String zuiGaoFen;
    private String kaoShengQu;
    private String keBie;
    private String nianFen;
    private String piCi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhuanYeMing() {
        return zhuanYeMing;
    }

    public void setZhuanYeMing(String zhuanYeMing) {
        this.zhuanYeMing = zhuanYeMing;
    }

    public String getDaXueMing() {
        return daXueMing;
    }

    public void setDaXueMing(String daXueMing) {
        this.daXueMing = daXueMing;
    }

    public String getPingJunFen() {
        return pingJunFen;
    }

    public void setPingJunFen(String pingJunFen) {
        this.pingJunFen = pingJunFen;
    }

    public String getZuiGaoFen() {
        return zuiGaoFen;
    }

    public void setZuiGaoFen(String zuiGaoFen) {
        this.zuiGaoFen = zuiGaoFen;
    }

    public String getKaoShengQu() {
        return kaoShengQu;
    }

    public void setKaoShengQu(String kaoShengQu) {
        this.kaoShengQu = kaoShengQu;
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

    @Override
    public String toString() {
        return "GtuZhuanYeFenShuBo{" +
                "id=" + id +
                ", zhuanYeMing='" + zhuanYeMing + '\'' +
                ", daXueMing='" + daXueMing + '\'' +
                ", pingJunFen='" + pingJunFen + '\'' +
                ", zuiGaoFen='" + zuiGaoFen + '\'' +
                ", kaoShengQu='" + kaoShengQu + '\'' +
                ", keBie='" + keBie + '\'' +
                ", nianFen='" + nianFen + '\'' +
                ", piCi='" + piCi + '\'' +
                '}';
    }
}
