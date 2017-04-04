package com.igouc.repository.impl.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class GtuGaoXiaoFenShuProvider {
    private static final String ALL_FIELD = " id, daxueming, zhaoshengqu, kebie, nianfen, pici, pingjunfen, xiancha ";
    private static final String TABLE = "gtu_gaoxiao_fenshu";

    public String getGtuGaoXiaoFenShuById(Integer arg0) {
        return String.format(" select %s from %s where id = %s ", ALL_FIELD, TABLE, arg0);
    }

    public String getGtuGaoXiaoFenShuByLastIdAndLimit(Integer arg0, Integer arg1) {
        return String.format(" select %s from %s where id > %s order by id asc limit %s ", ALL_FIELD, TABLE, arg0, arg1);
    }
}
