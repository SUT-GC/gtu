package com.igouc.service.bo;

public class MajorBo {
    private String Major;

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    @Override
    public String toString() {
        return "MajorBo{" +
                "Major='" + Major + '\'' +
                '}';
    }
}
