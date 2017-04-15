package com.igouc.repository.po;

import com.alibaba.fastjson.JSONObject;

public class CityPo {
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "CityPo{" +
                "cityName='" + cityName + '\'' +
                '}';
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
