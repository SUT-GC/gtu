package com.igouc.repository.impl.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class GtuGaoXiaoFenShuProvider {
    private static final String ALL_FIELD = " id, daxueming, zhaoshengqu, kebie, nianfen, pici, pingjunfen, xiancha ";
    private static final String TABLE = "gtu_gaoxiao_fenshu";

    public String getGtuGaoXiaoFenShuById(Integer arg0){
        SQL sql = new SQL();
        sql.SELECT(ALL_FIELD).FROM(TABLE);
        sql.WHERE("id = #{arg0}");
        return sql.toString();
    }
}
