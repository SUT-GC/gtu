package com.igouc.repository.impl;

import com.igouc.repository.GtuGaoXiaoFenShuRepository;
import com.igouc.repository.impl.mapper.GtuGaoXiaoFenShuMapper;
import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GtuGaoXiaoFenShuRepositoryImpl implements GtuGaoXiaoFenShuRepository{

    @Autowired
    private GtuGaoXiaoFenShuMapper gtuGaoXiaoFenShuMapper;

    @Override
    public GtuGaoxiaoFenshuPO getGtuGaoXiaoFenShuById(Integer id){
        return gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuById(id);
    }
}