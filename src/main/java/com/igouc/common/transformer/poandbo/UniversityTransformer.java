package com.igouc.common.transformer.poandbo;

import com.igouc.common.util.ListUtil;
import com.igouc.repository.po.UniversityPo;
import com.igouc.repository.po.YearPo;
import com.igouc.service.bo.UniversityBo;
import com.igouc.service.bo.YearBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class UniversityTransformer {
    public UniversityBo toUniversityBo(UniversityPo po) {
        if (po == null) {
            return null;
        }
        UniversityBo bo = new UniversityBo();
        bo.setUniversityName(po.getUniversityName());

        return bo;
    }

    public List<UniversityBo> toUniversityBos(List<UniversityPo> pos) {
        if (ListUtil.isEmptyList(pos)) {
            return Collections.emptyList();
        }
        List<UniversityBo> bos = new ArrayList<>();
        for (UniversityPo po : pos) {
            bos.add(toUniversityBo(po));
        }

        return bos;
    }
}
