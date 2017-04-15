package com.igouc.common.transformer.poandbo;

import com.igouc.common.util.ListUtil;
import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import com.igouc.repository.po.GtuZhuanYeFenShuPo;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import com.igouc.service.bo.GtuZhuanYeFenShuBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public List<GtuZhuanYeFenShuBo> toZhuanYeFenShuBos(List<GtuZhuanYeFenShuPo> pos) {
        if (ListUtil.isEmptyList(pos)) {
            return Collections.emptyList();
        }

        List<GtuZhuanYeFenShuBo> bos = new ArrayList<>();

        for (GtuZhuanYeFenShuPo po : pos) {
            bos.add(toZhuanYeFenShuBo(po));
        }

        return bos;
    }
}
