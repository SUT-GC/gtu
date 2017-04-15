package com.igouc.repository.impl.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class GtuZhuanYeFenShuProvider {
    private static final String ALL_CLOUMNS = " id, zhuanyeming, daxueming, pingjunfen, zuigaofen, kaoshengqu, kebie, nianfen, pici ";
    private static final String TABLE = " gtu_zuanye_fenshu ";

    public String getZhuanYenFenShuById(Integer arg0) {
        return String.format(" select %s from %s where id = %s ;", ALL_CLOUMNS, TABLE, arg0);
    }

    public String getZhuanYe(String arg0) {
        SQL sql = new SQL();
        sql.SELECT(ALL_CLOUMNS).FROM(TABLE);
        sql.WHERE(" zhuanyeming = '" + arg0 + "' ");
        sql.ORDER_BY(" nianfen asc ");

        return sql.toString();
    }

    public String selectZhuanYeScore(String arg0, String arg1, String arg2) {
        SQL sql = new SQL();
        sql.SELECT(ALL_CLOUMNS).FROM(TABLE);
        sql.WHERE(String.format(" zhuanyeming = '%s' ", arg0));
        sql.WHERE(String.format(" kaoshengqu = '%s' ", arg1));
        sql.WHERE(String.format(" nianfen = '%s' ", arg2));

        return sql.toString();
    }

    public String selectMajorInUniversity(String arg0) {
        SQL sql = new SQL();
        sql.SELECT(ALL_CLOUMNS).FROM(TABLE);
        sql.WHERE(" daxueming = '" + arg0 + "' ");
        sql.ORDER_BY(" nianfen asc ");

        return sql.toString();
    }
}
