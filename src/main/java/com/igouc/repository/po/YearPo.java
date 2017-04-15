package com.igouc.repository.po;

import com.alibaba.fastjson.JSONObject;

public class YearPo {
    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "YearPo{" +
                "year='" + year + '\'' +
                '}';
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
