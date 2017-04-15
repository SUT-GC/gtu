package com.igouc.common.transformer.poandbo;

import com.igouc.common.util.ListUtil;
import com.igouc.repository.po.CityPo;
import com.igouc.repository.po.KeBiePo;
import com.igouc.service.bo.CityBo;
import com.igouc.service.bo.KeBieBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class CityTransformer {
    public CityBo toCityBo(CityPo po) {
        if (po == null) {
            return null;
        }
        CityBo bo = new CityBo();
        bo.setCityName(po.getCityName());

        return bo;
    }

    public List<CityBo> toCityBos(List<CityPo> pos) {
        if (ListUtil.isEmptyList(pos)) {
            return Collections.emptyList();
        }
        List<CityBo> bos = new ArrayList<>();
        for (CityPo po : pos) {
            bos.add(toCityBo(po));
        }

        return bos;
    }
}
