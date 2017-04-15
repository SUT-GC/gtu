package com.igouc.repository.impl.mapper.provider;

public class ListInfoProvider {
    public String getAllCitys() {
        return " select DISTINCT(zhaoshengqu) from gtu_gaoxiao_fenshu; ";
    }

    public String getAllYears() {
        return " select DISTINCT(nianfen) from gtu_gaoxiao_fenshu; ";
    }

    public String getAllKeBies() {
        return " select DISTINCT(kebie) from gtu_gaoxiao_fenshu; ";
    }

    public String getAllMajors() {
        return " select DISTINCT(zhuanyeming) from gtu_zuanye_fenshu; ";
    }

    public String getAllUniversitys() {
        return " select DISTINCT(daxueming) from gtu_gaoxiao_fenshu; ";
    }
}
