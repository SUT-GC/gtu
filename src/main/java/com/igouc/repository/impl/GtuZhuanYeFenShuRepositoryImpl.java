package com.igouc.repository.impl;

import com.igouc.common.transformer.poandbo.GtuZhuanYeFenShuTransformer;
import com.igouc.repository.GtuZhuanYeFenShuRepository;
import com.igouc.repository.impl.mapper.GtuZhuanYeFenShuMapper;
import com.igouc.repository.po.GtuZhuanYeFenShuPo;
import com.igouc.service.bo.GtuZhuanYeFenShuBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<GtuZhuanYeFenShuBo> getZhuanYe(String zhuanYeMing) {
        List<GtuZhuanYeFenShuPo> pos = mapper.getZhuanYe(zhuanYeMing);

        return transformer.toZhuanYeFenShuBos(pos);
    }

    @Override
    public List<GtuZhuanYeFenShuBo> selectZhuanYeScore(String zhuanYeMing, String zhaoShengQu, String nianFen) {
        List<GtuZhuanYeFenShuPo> pos = mapper.selectZhuanYeScore(zhuanYeMing, zhaoShengQu, nianFen);

        return transformer.toZhuanYeFenShuBos(pos);
    }

    @Override
    public List<GtuZhuanYeFenShuBo> selectMajorInUniversity(String universityName) {
        List<GtuZhuanYeFenShuPo> pos = mapper.selectMajorInUniversity(universityName);

        return transformer.toZhuanYeFenShuBos(pos);
    }
}
