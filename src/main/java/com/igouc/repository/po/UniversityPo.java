package com.igouc.repository.po;

import com.alibaba.fastjson.JSONObject;

public class UniversityPo {
    String universityName;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "UniversityPo{" +
                "universityName='" + universityName + '\'' +
                '}';
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
