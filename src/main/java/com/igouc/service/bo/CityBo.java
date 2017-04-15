package com.igouc.service.bo;

import com.alibaba.fastjson.JSONObject;

public class CityBo {
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "CityBo{" +
                "cityName='" + cityName + '\'' +
                '}';
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
