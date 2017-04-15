package com.igouc.repository;

import com.igouc.repository.impl.mapper.ListInfoMapper;
import com.igouc.service.bo.*;

import java.util.List;

public interface ListInfoRepository {
    List<CityBo> getAllCitys();

    List<UniversityBo> getAllUniversitys();

    List<YearBo> getAllYears();

    List<MajorBo> getAllMajors();

    List<KeBieBo> getAllKeBies();
}
