package com.igouc.repository;

import com.igouc.service.bo.GtuZhuanYeFenShuBo;

import java.util.List;

public interface GtuZhuanYeFenShuRepository {

    GtuZhuanYeFenShuBo getZhuanYeFenShuById(Integer id);

    List<GtuZhuanYeFenShuBo> getZhuanYe(String zhuanYeMing);

    List<GtuZhuanYeFenShuBo> selectZhuanYeScore(String majorName, String cityName, String year);

    List<GtuZhuanYeFenShuBo> selectMajorInUniversity(String daXueMing);
}
