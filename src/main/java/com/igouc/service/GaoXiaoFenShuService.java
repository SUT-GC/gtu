package com.igouc.service;

import com.igouc.common.transformer.boanddto.GtuGaoXiaoFenShuTransformer;
import com.igouc.gtuapi.dto.GtuGaoxiaoFenshuDTO;
import com.igouc.repository.GtuGaoXiaoFenShuRepository;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GaoXiaoFenShuService {

    @Autowired
    private GtuGaoXiaoFenShuRepository gtuGaoXiaoFenShuRepository;
    @Autowired
    private GtuGaoXiaoFenShuTransformer transformer;

    private static final Logger LOG = Logger.getLogger(GaoXiaoFenShuService.class);

    public GtuGaoxiaoFenshuDTO getGaoXiaoFenShuById(Integer id) {
        GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo = gtuGaoXiaoFenShuRepository.getGtuGaoXiaoFenShuById(id);
        GtuGaoxiaoFenshuDTO gtuGaoxiaoFenshuDTO = transformer.Bo2Dto(gtuGaoXiaoFenShuBo);

        return gtuGaoxiaoFenshuDTO;
    }
}
