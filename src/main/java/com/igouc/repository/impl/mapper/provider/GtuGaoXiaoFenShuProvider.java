package com.igouc.repository.impl.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class GtuGaoXiaoFenShuProvider {
    private static final String ALL_FIELD = " id, daxueming, zhaoshengqu, kebie, nianfen, pici, pingjunfen, xiancha ";
    private static final String TABLE = "gtu_gaoxiao_fenshu";

    public String getGtuGaoXiaoFenShuById(Integer arg0) {
        return String.format(" select %s from %s where id = %s ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuByLastIdAndLimit(Long arg0, Integer arg1) {
        return String.format(" select %s from %s where id > %s order by id asc limit %s ", ALL_FIELD, TABLE, arg0, arg1);
    }

    public String getGtuGaoXiaoFenShuByDaXueMing(String arg0) {
        return String.format(" select %s from %s where daxueming = '%s' ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuLikeDaXueMing(String arg0) {
        return " select " + ALL_FIELD + " from " + TABLE + " where daxueming like '%" + arg0 + "%' ";
    }

    public String getGtuGaoXiaoFenShuByKeBie(String arg0) {
        return String.format(" select %s from %s where kebie = '%s' ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuByNianFen(String arg0) {
        return String.format(" select %s from %s where nianfen = '%s' ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuByZhaoShengQu(String arg0) {
        return String.format(" select %s from %s where zhaoshengqu = '%s' ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuByPiCi(String arg0) {
        return String.format(" select %s from %s where pici = '%s' ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuByPingJunFen(String arg0) {
        return String.format(" select %s from %s where pingjunfen = '%s' ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuByKongFenXian(String arg0) {
        return String.format(" select %s from %s where kongfenxian = '%s' ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuByXianCha(String arg0) {
        return String.format(" select %s from %s where xiancha = '%s' ", ALL_FIELD, TABLE, arg0);
    }

    public String getGaoXiaoInfo(String arg0, String arg1, String arg2) {
        SQL sql = new SQL();
        sql.SELECT(ALL_FIELD).FROM(TABLE);
        sql.WHERE(" zhaoshengqu = '%" + arg0 + "%' ").WHERE(" kebie = '%" + arg1 + "%' ").WHERE(" nianfen = '%" + arg2 + "%' ");
        return sql.toString();
    }

    public String selectByScore(String arg0, String arg1, String arg2) {
        SQL sql = new SQL();
        sql.SELECT(ALL_FIELD).FROM(TABLE);
        sql.WHERE(String.format(" zhaoshengqu = '%s' ", arg0));
        sql.WHERE(String.format(" kongfenxian != '--' and kongfenxian > '%s' ", arg1));
        sql.WHERE(String.format(" nianfen = '%s' ", arg2));

        return sql.toString();
    }

    public String selectCityScore(String arg0, String arg1, String arg2) {
        SQL sql = new SQL();
        sql.SELECT(ALL_FIELD).FROM(TABLE);
        sql.WHERE(String.format(" zhaoshengqu = '%s' ", arg0));
        sql.WHERE(String.format(" kebie = '%s' ", arg1));
        sql.WHERE(String.format(" nianfen = '%s' ", arg2));

        return sql.toString();
    }
}
