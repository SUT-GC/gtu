package com.igouc.repository.impl;

import com.igouc.common.transformer.poandbo.GtuZhuanYeFenShuTransformer;
import com.igouc.repository.GtuZhuanYeFenShuRepository;
import com.igouc.repository.impl.mapper.GtuZhuanYeFenShuMapper;
import com.igouc.service.bo.GtuZhuanYeFenShuBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GtuZhuanYeFenShuRepositoryImpl implements GtuZhuanYeFenShuRepository {

    @Autowired
    private GtuZhuanYeFenShuMapper mapper;
    @Autowired
    private GtuZhuanYeFenShuTransformer transformer;

    @Override
    public GtuZhuanYeFenShuBo getZhuanYeFenShuById(Integer id) {

        return transformer.toZhuanYeFenShuBo(mapper.getZhuanYenFenShuById(id));
    }
}
