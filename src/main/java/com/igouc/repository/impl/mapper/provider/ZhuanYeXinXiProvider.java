package com.igouc.repository.impl.mapper.provider;

public class ZhuanYeXinXiProvider {
    private static final String ALL_COLUMNS = " zhuanyeming, url ";
    private static final String TABLE_NAME = "gtu_zhuanye_xinxi";

    public String getZhuanYeXinXiByName(String arg0) {
        return String.format(" select %s from %s where zhuanyeming = '%s' ", ALL_COLUMNS, TABLE_NAME, arg0);
    }
}
