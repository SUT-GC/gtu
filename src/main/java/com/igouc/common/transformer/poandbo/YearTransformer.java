package com.igouc.common.transformer.poandbo;

import com.igouc.common.util.ListUtil;
import com.igouc.repository.po.YearPo;
import com.igouc.service.bo.YearBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class YearTransformer {
    public YearBo toYearBo(YearPo po) {
        if (po == null) {
            return null;
        }
        YearBo bo = new YearBo();
        bo.setYear(po.getYear());

        return bo;
    }

    public List<YearBo> toYearBos(List<YearPo> pos) {
        if (ListUtil.isEmptyList(pos)) {
            return Collections.emptyList();
        }
        List<YearBo> bos = new ArrayList<>();
        for (YearPo po : pos) {
            bos.add(toYearBo(po));
        }

        return bos;
    }
}
