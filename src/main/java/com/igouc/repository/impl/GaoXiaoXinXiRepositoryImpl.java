package com.igouc.repository.impl;

import com.igouc.common.transformer.poandbo.GaoXiaoXinXiTransformer;
import com.igouc.repository.GaoXiaoXinXiRepository;
import com.igouc.repository.impl.mapper.GaoXiaoXinXiMapper;
import com.igouc.service.bo.GaoXiaoXinXiBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GaoXiaoXinXiRepositoryImpl implements GaoXiaoXinXiRepository {

    @Autowired
    private GaoXiaoXinXiMapper mapper;
    @Autowired
    private GaoXiaoXinXiTransformer transformer;

    @Override
    public GaoXiaoXinXiBo getGaoXiaoXinXi(String gaoXiaoMing) {

        return transformer.toGaoXiaoXinXiBo(mapper.getGaoXiaoXinXiByName(gaoXiaoMing));
    }
}
