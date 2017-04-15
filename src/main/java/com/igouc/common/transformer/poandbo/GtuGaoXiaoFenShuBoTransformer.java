package com.igouc.common.transformer.poandbo;

import com.igouc.common.util.ListUtil;
import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class GtuGaoXiaoFenShuBoTransformer {
    public GtuGaoxiaoFenshuPO Bo2Po(GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo) {
        if (gtuGaoXiaoFenShuBo == null)
            return null;
        GtuGaoxiaoFenshuPO gtuGaoxiaoFenshuPO = new GtuGaoxiaoFenshuPO();
        gtuGaoxiaoFenshuPO.setId(gtuGaoXiaoFenShuBo.getId());
        gtuGaoxiaoFenshuPO.setDaXueMing(gtuGaoXiaoFenShuBo.getDaXueMing());
        gtuGaoxiaoFenshuPO.setKeBie(gtuGaoXiaoFenShuBo.getKeBie());
        gtuGaoxiaoFenshuPO.setKongFenXian(gtuGaoXiaoFenShuBo.getKongFenXian());
        gtuGaoxiaoFenshuPO.setNianFen(gtuGaoXiaoFenShuBo.getNianFen());
        gtuGaoxiaoFenshuPO.setPiCi(gtuGaoXiaoFenShuBo.getPiCi());
        gtuGaoxiaoFenshuPO.setPingJunFen(gtuGaoXiaoFenShuBo.getPingJunFen());
        gtuGaoxiaoFenshuPO.setXianCha(gtuGaoXiaoFenShuBo.getXianCha());
        gtuGaoxiaoFenshuPO.setZhaoShengQu(gtuGaoXiaoFenShuBo.getZhaoShengQu());

        return gtuGaoxiaoFenshuPO;
    }

    public List<GtuGaoxiaoFenshuPO> Bo2Pos(List<GtuGaoXiaoFenShuBo> gtuGaoXiaoFenShuBos) {
        if (ListUtil.isEmptyList(gtuGaoXiaoFenShuBos))
            return Collections.emptyList();
        List<GtuGaoxiaoFenshuPO> pos = new ArrayList<>();

        for (GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo : gtuGaoXiaoFenShuBos) {
            if (gtuGaoXiaoFenShuBo == null)
                continue;
            pos.add(this.Bo2Po(gtuGaoXiaoFenShuBo));
        }

        return pos;
    }

    public GtuGaoXiaoFenShuBo Po2Bo(GtuGaoxiaoFenshuPO gtuGaoxiaoFenshuPO) {
        if (gtuGaoxiaoFenshuPO == null)
            return null;
        GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo = new GtuGaoXiaoFenShuBo();
        gtuGaoXiaoFenShuBo.setId(gtuGaoxiaoFenshuPO.getId());
        gtuGaoXiaoFenShuBo.setDaXueMing(gtuGaoxiaoFenshuPO.getDaXueMing());
        gtuGaoXiaoFenShuBo.setKeBie(gtuGaoxiaoFenshuPO.getKeBie());
        gtuGaoXiaoFenShuBo.setKongFenXian(gtuGaoxiaoFenshuPO.getKongFenXian());
        gtuGaoXiaoFenShuBo.setNianFen(gtuGaoxiaoFenshuPO.getNianFen());
        gtuGaoXiaoFenShuBo.setPiCi(gtuGaoxiaoFenshuPO.getPiCi());
        gtuGaoXiaoFenShuBo.setPingJunFen(gtuGaoxiaoFenshuPO.getPingJunFen());
        gtuGaoXiaoFenShuBo.setXianCha(gtuGaoxiaoFenshuPO.getXianCha());
        gtuGaoXiaoFenShuBo.setZhaoShengQu(gtuGaoxiaoFenshuPO.getZhaoShengQu());

        return gtuGaoXiaoFenShuBo;
    }

    public List<GtuGaoXiaoFenShuBo> Po2Bos(List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs) {
        if (ListUtil.isEmptyList(gtuGaoxiaoFenshuPOs))
            return Collections.emptyList();
        List<GtuGaoXiaoFenShuBo> bos = new ArrayList<>();

        for (GtuGaoxiaoFenshuPO gtuGaoxiaoFenshuPO : gtuGaoxiaoFenshuPOs) {
            if (gtuGaoxiaoFenshuPO == null)
                continue;
            bos.add(this.Po2Bo(gtuGaoxiaoFenshuPO));
        }

        return bos;
    }
}
