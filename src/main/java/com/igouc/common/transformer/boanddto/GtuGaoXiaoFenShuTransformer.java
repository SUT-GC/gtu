package com.igouc.common.transformer.boanddto;

import com.igouc.common.util.ListUtil;
import com.igouc.gtuapi.dto.GtuGaoxiaoFenshuDTO;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class GtuGaoXiaoFenShuTransformer {
    public GtuGaoxiaoFenshuDTO Bo2Dto(GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo) {
        if (gtuGaoXiaoFenShuBo == null)
            return null;
        GtuGaoxiaoFenshuDTO gtuGaoxiaoFenshuDTO = new GtuGaoxiaoFenshuDTO();
        gtuGaoxiaoFenshuDTO.setId(gtuGaoXiaoFenShuBo.getId());
        gtuGaoxiaoFenshuDTO.setDaXueMing(gtuGaoXiaoFenShuBo.getDaXueMing());
        gtuGaoxiaoFenshuDTO.setKeBie(gtuGaoXiaoFenShuBo.getKeBie());
        gtuGaoxiaoFenshuDTO.setKongFenXian(gtuGaoXiaoFenShuBo.getKongFenXian());
        gtuGaoxiaoFenshuDTO.setNianFen(gtuGaoXiaoFenShuBo.getNianFen());
        gtuGaoxiaoFenshuDTO.setPiCi(gtuGaoXiaoFenShuBo.getPiCi());
        gtuGaoxiaoFenshuDTO.setPingJunFen(gtuGaoXiaoFenShuBo.getPingJunFen());
        gtuGaoxiaoFenshuDTO.setXianCha(gtuGaoXiaoFenShuBo.getXianCha());
        gtuGaoxiaoFenshuDTO.setZhaoShengQu(gtuGaoXiaoFenShuBo.getZhaoShengQu());

        return gtuGaoxiaoFenshuDTO;
    }

    public List<GtuGaoxiaoFenshuDTO> Bo2Dtos(List<GtuGaoXiaoFenShuBo> gtuGaoXiaoFenShuBos) {
        if (ListUtil.isEmptyList(gtuGaoXiaoFenShuBos)) {
            return Collections.emptyList();
        }
        List<GtuGaoxiaoFenshuDTO> dtos = new ArrayList<>();
        for (GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo : gtuGaoXiaoFenShuBos) {
            if (gtuGaoXiaoFenShuBo == null)
                continue;
            dtos.add(this.Bo2Dto(gtuGaoXiaoFenShuBo));
        }

        return dtos;
    }

    public GtuGaoXiaoFenShuBo Dto2Bo(GtuGaoxiaoFenshuDTO gtuGaoxiaoFenshuDTO) {
        if (gtuGaoxiaoFenshuDTO == null)
            return null;
        GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo = new GtuGaoXiaoFenShuBo();
        gtuGaoXiaoFenShuBo.setId(gtuGaoxiaoFenshuDTO.getId());
        gtuGaoXiaoFenShuBo.setDaXueMing(gtuGaoxiaoFenshuDTO.getDaXueMing());
        gtuGaoXiaoFenShuBo.setKeBie(gtuGaoxiaoFenshuDTO.getKeBie());
        gtuGaoXiaoFenShuBo.setKongFenXian(gtuGaoxiaoFenshuDTO.getKongFenXian());
        gtuGaoXiaoFenShuBo.setNianFen(gtuGaoxiaoFenshuDTO.getNianFen());
        gtuGaoXiaoFenShuBo.setPiCi(gtuGaoxiaoFenshuDTO.getPiCi());
        gtuGaoXiaoFenShuBo.setPingJunFen(gtuGaoxiaoFenshuDTO.getPingJunFen());
        gtuGaoXiaoFenShuBo.setXianCha(gtuGaoxiaoFenshuDTO.getXianCha());
        gtuGaoXiaoFenShuBo.setZhaoShengQu(gtuGaoxiaoFenshuDTO.getZhaoShengQu());

        return gtuGaoXiaoFenShuBo;
    }

    public List<GtuGaoXiaoFenShuBo> Dto2Bos(List<GtuGaoxiaoFenshuDTO> gtuGaoxiaoFenshuDTOs) {
        if (ListUtil.isEmptyList(gtuGaoxiaoFenshuDTOs)) {
            return Collections.emptyList();
        }
        List<GtuGaoXiaoFenShuBo> bos = new ArrayList<>();
        for (GtuGaoxiaoFenshuDTO gtuGaoxiaoFenshuDTO : gtuGaoxiaoFenshuDTOs) {
            if (gtuGaoxiaoFenshuDTO == null)
                continue;
            bos.add(this.Dto2Bo(gtuGaoxiaoFenshuDTO));
        }

        return bos;
    }

}
