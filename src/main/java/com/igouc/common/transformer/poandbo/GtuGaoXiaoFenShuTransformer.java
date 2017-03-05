package com.igouc.common.transformer.poandbo;

import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.springframework.stereotype.Component;

@Component
public class GtuGaoXiaoFenShuTransformer {
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
}
