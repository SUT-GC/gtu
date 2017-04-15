package com.igouc.repository.impl.mapper.provider;

public class GaoXiaoXinXiProvider {
    private static final String ALL_COLUMNS = " daxueming, url ";
    private static final String TABLE_NAME = "gtu_gaoxiao_xinxi";

    public String getGaoXiaoXinXiByName(String arg0) {
        return String.format(" select %s from %s where daxueming = '%s' ", ALL_COLUMNS, TABLE_NAME, arg0);
    }
}
