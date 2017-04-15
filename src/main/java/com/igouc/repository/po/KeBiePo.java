package com.igouc.repository.po;

import com.alibaba.fastjson.JSONObject;

public class KeBiePo {
    private String keBie;

    public String getKeBie() {
        return keBie;
    }

    public void setKeBie(String keBie) {
        this.keBie = keBie;
    }

    @Override
    public String toString() {
        return "KeBiePo{" +
                "keBie='" + keBie + '\'' +
                '}';
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
