package com.igouc.common.transformer.poandbo;

import com.igouc.common.util.ListUtil;
import com.igouc.repository.po.MajorPo;
import com.igouc.service.bo.MajorBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class MajorTransformer {
    public MajorBo toMajorPo(MajorPo po) {
        if (po == null) {
            return null;
        }
        MajorBo bo = new MajorBo();
        bo.setMajor(po.getMajor());

        return bo;
    }

    public List<MajorBo> toMajorPos(List<MajorPo> pos) {
        if (ListUtil.isEmptyList(pos)) {
            return Collections.emptyList();
        }
        List<MajorBo> bos = new ArrayList<>();
        for (MajorPo po : pos) {
            bos.add(toMajorPo(po));
        }

        return bos;
    }

}
