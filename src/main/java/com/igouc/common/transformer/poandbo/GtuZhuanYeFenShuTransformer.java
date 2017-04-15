package com.igouc.common.transformer.poandbo;

import com.igouc.repository.po.GtuZhuanYeFenShuPo;
import com.igouc.service.bo.GtuZhuanYeFenShuBo;
import org.springframework.stereotype.Component;

@Component
public class GtuZhuanYeFenShuTransformer {
    public GtuZhuanYeFenShuBo toZhuanYeFenShuBo(GtuZhuanYeFenShuPo po) {
        if (po == null) {
            return null;
        }
        GtuZhuanYeFenShuBo bo = new GtuZhuanYeFenShuBo();
        bo.setId(po.getId());
        bo.setZhuanYeMing(po.getZhuanYeMing());
        bo.setDaXueMing(po.getDaXueMing());
        bo.setKaoShengQu(po.getKaoShengQu());
        bo.setKeBie(po.getKeBie());
        bo.setNianFen(po.getNianFen());
        bo.setPiCi(po.getPiCi());
        bo.setPingJunFen(po.getPingJunFen());
        bo.setZuiGaoFen(po.getZuiGaoFen());

        return bo;
    }
}
