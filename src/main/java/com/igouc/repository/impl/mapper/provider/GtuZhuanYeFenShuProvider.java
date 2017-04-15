package com.igouc.repository.impl.mapper.provider;

public class GtuZhuanYeFenShuProvider {
    private static final String ALL_CLOUMNS = " id, zhuanyeming, daxueming, pingjunfen, zuigaofen, kaoshengqu, kebie, nianfen, pici ";
    private static final String TABLE = " gtu_zhuanye_fenshu ";

    public String getZhuanYenFenShuById(Integer arg0) {
        return String.format(" select %s from %s where id = %s ;", ALL_CLOUMNS, TABLE, arg0);
    }
}
