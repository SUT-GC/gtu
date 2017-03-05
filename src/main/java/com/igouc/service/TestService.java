package com.igouc.service;

import com.igouc.common.transformer.poandbo.GtuGaoXiaoFenShuTransformer;
import com.igouc.repository.GtuGaoXiaoFenShuRepository;
import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private GtuGaoXiaoFenShuRepository gtuGaoXiaoFenShuRepository;
    @Autowired
    private GtuGaoXiaoFenShuTransformer gtuGaoXiaoFenShuTransformer;

    public GtuGaoXiaoFenShuBo getGaoXiaoFenShuById(Integer id){
        GtuGaoxiaoFenshuPO gtuGaoxiaoFenshuPO = gtuGaoXiaoFenShuRepository.getGtuGaoXiaoFenShuById(id);
        GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo = gtuGaoXiaoFenShuTransformer.Po2Bo(gtuGaoxiaoFenshuPO);

        return gtuGaoXiaoFenShuBo;
    }
}
