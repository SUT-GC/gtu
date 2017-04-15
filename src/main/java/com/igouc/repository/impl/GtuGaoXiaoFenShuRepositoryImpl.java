package com.igouc.repository.impl;

import com.igouc.common.transformer.poandbo.GtuGaoXiaoFenShuTransformer;
import com.igouc.repository.GtuGaoXiaoFenShuRepository;
import com.igouc.repository.impl.mapper.GtuGaoXiaoFenShuMapper;
import com.igouc.repository.po.GtuGaoxiaoFenshuPO;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GtuGaoXiaoFenShuRepositoryImpl implements GtuGaoXiaoFenShuRepository {

    @Autowired
    private GtuGaoXiaoFenShuMapper gtuGaoXiaoFenShuMapper;
    @Autowired
    private GtuGaoXiaoFenShuTransformer transformer;

    @Override
    public GtuGaoXiaoFenShuBo getGtuGaoXiaoFenShuById(Integer id) {
        GtuGaoxiaoFenshuPO gtuGaoxiaoFenshuPO = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuById(id);

        return transformer.Po2Bo(gtuGaoxiaoFenshuPO);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByLastIdAndLimit(Long lastId, Integer limit) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByLastIdAndLimit(lastId, limit);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByDaXueMing(String daXueMing) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByDaXueMing(daXueMing);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuLikeDaXueMing(String daXueMing) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuLikeDaXueMing(daXueMing);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByZhaoShengQu(String zhaoShengQu) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByZhaoShengQu(zhaoShengQu);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByKeBie(String keBie) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByKeBie(keBie);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByNianFen(String nianFen) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByNianFen(nianFen);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByPiCi(String piCi) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByPiCi(piCi);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByPingJunFen(String pingJunFen) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByPingJunFen(pingJunFen);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByKongFenXian(String kongFenXian) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByKongFenXian(kongFenXian);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }

    @Override
    public List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByXianCha(String xianCha) {
        List<GtuGaoxiaoFenshuPO> gtuGaoxiaoFenshuPOs = gtuGaoXiaoFenShuMapper.getGtuGaoXiaoFenShuByXianCha(xianCha);

        return transformer.Po2Bos(gtuGaoxiaoFenshuPOs);
    }
}
