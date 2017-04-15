package com.igouc.repository;

import com.igouc.service.bo.GtuGaoXiaoFenShuBo;

import java.util.List;

public interface GtuGaoXiaoFenShuRepository {
    GtuGaoXiaoFenShuBo getGtuGaoXiaoFenShuById(Integer id);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByLastIdAndLimit(Long lastId, Integer limit);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByDaXueMing(String daXueMing);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuLikeDaXueMing(String daXueMing);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByZhaoShengQu(String zhaoShengQu);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByKeBie(String keBie);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByNianFen(String nianFen);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByPiCi(String piCi);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByPingJunFen(String pingJunFen);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByKongFenXian(String kongFenXian);

    List<GtuGaoXiaoFenShuBo> getGtuGaoXiaoFenShuByXianCha(String xianCha);

    List<GtuGaoXiaoFenShuBo> getGaoXiaoInfo(String cityName, String kebie, String year);

    List<GtuGaoXiaoFenShuBo> selectByScore(String zhaoShengQu, String kongFenXian, String nianFen);

    List<GtuGaoXiaoFenShuBo> selectCityScore(String cityName, String keBie, String year);
}
