package com.igouc.repository.po;

import com.alibaba.fastjson.JSONObject;

public class MajorPo {
    private String Major;

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    @Override
    public String toString() {
        return "MajorPo{" +
                "Major='" + Major + '\'' +
                '}';
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
