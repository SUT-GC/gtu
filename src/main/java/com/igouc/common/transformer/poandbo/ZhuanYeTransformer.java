package com.igouc.common.transformer.poandbo;

import com.igouc.repository.po.ZhuanYeXinXiPo;
import com.igouc.service.bo.ZhuanYeXinXiBo;
import org.springframework.stereotype.Component;

@Component
public class ZhuanYeTransformer {
    public ZhuanYeXinXiBo toZhuanYeXinxiPo(ZhuanYeXinXiPo po) {
        if (po == null) {
            return null;
        }
        ZhuanYeXinXiBo bo = new ZhuanYeXinXiBo();
        bo.setZhuanYeMing(po.getZhuanYeMing());
        bo.setZhuanYeUrl(po.getZhuanYeUrl());

        return bo;
    }
}
