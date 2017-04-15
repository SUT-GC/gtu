package com.igouc.common.transformer.poandbo;

import com.igouc.repository.po.GaoXiaoXinXiPo;
import com.igouc.service.bo.GaoXiaoXinXiBo;
import org.springframework.stereotype.Component;

@Component
public class GaoXiaoXinXiTransformer {
    public GaoXiaoXinXiBo toGaoXiaoXinXiBo(GaoXiaoXinXiPo po) {
        if (po == null) {
            return null;
        }
        GaoXiaoXinXiBo bo = new GaoXiaoXinXiBo();
        bo.setGaoXiaoMing(po.getDaXueMing());
        bo.setGaoXiaoUrl(po.getDaxueUrl());

        return bo;
    }
}
