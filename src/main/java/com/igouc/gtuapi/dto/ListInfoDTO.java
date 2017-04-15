package com.igouc.gtuapi.dto;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class ListInfoDTO {
    private List<String> allCity;
    private List<String> allUniversity;
    private List<String> allYears;
    private List<String> allKeBie;
    private List<String> allMajor;

    public List<String> getAllCity() {
        return allCity;
    }

    public void setAllCity(List<String> allCity) {
        this.allCity = allCity;
    }

    public List<String> getAllUniversity() {
        return allUniversity;
    }

    public void setAllUniversity(List<String> allUniversity) {
        this.allUniversity = allUniversity;
    }

    public List<String> getAllYears() {
        return allYears;
    }

    public void setAllYears(List<String> allYears) {
        this.allYears = allYears;
    }

    public List<String> getAllKeBie() {
        return allKeBie;
    }

    public void setAllKeBie(List<String> allKeBie) {
        this.allKeBie = allKeBie;
    }

    public List<String> getAllMajor() {
        return allMajor;
    }

    public void setAllMajor(List<String> allMajor) {
        this.allMajor = allMajor;
    }

    @Override
    public String toString() {
        return "ListInfoDTO{" +
                "allCity=" + allCity +
                ", allUniversity=" + allUniversity +
                ", allYears=" + allYears +
                ", allKeBie=" + allKeBie +
                ", allMajor=" + allMajor +
                '}';
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
