package com.igouc.common.transformer.poandbo;

import com.igouc.common.util.ListUtil;
import com.igouc.repository.po.KeBiePo;
import com.igouc.repository.po.YearPo;
import com.igouc.service.bo.KeBieBo;
import com.igouc.service.bo.YearBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class KeBieTransformer {
    public KeBieBo toKeBieBo(KeBiePo po) {
        if (po == null) {
            return null;
        }
        KeBieBo bo = new KeBieBo();
        bo.setKebie(po.getKeBie());

        return bo;
    }

    public List<KeBieBo> toKeBieBos(List<KeBiePo> pos) {
        if (ListUtil.isEmptyList(pos)) {
            return Collections.emptyList();
        }
        List<KeBieBo> bos = new ArrayList<>();
        for (KeBiePo po : pos) {
            bos.add(toKeBieBo(po));
        }

        return bos;
    }
}
