package com.igouc.repository.impl;

import com.igouc.common.transformer.poandbo.ZhuanYeTransformer;
import com.igouc.repository.ZhuanYeXinXiRepository;
import com.igouc.repository.impl.mapper.GtuZhuanYeFenShuMapper;
import com.igouc.repository.impl.mapper.ZhuanYeXinXiMapper;
import com.igouc.service.bo.ZhuanYeXinXiBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ZhuanYeXinXiRepositoryImpl implements ZhuanYeXinXiRepository {
    @Autowired
    private ZhuanYeXinXiMapper mapper;
    @Autowired
    private ZhuanYeTransformer transformer;

    @Override
    public ZhuanYeXinXiBo getZhuanYeXinXi(String zhuanYeMing) {
        return transformer.toZhuanYeXinxiPo(mapper.getZhuanYeXinXiByName(zhuanYeMing));
    }
}
