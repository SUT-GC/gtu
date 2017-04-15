package com.igouc.service.bo;

public class UniversityBo {
    private String universityName;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "UniversityBo{" +
                "universityName='" + universityName + '\'' +
                '}';
    }
}
