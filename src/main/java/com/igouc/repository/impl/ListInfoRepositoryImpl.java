package com.igouc.repository.impl;

import com.igouc.common.transformer.poandbo.*;
import com.igouc.repository.ListInfoRepository;
import com.igouc.repository.impl.mapper.ListInfoMapper;
import com.igouc.repository.po.*;
import com.igouc.service.bo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ListInfoRepositoryImpl implements ListInfoRepository {

    @Autowired
    private ListInfoMapper mapper;

    @Autowired
    private CityTransformer cityTransformer;

    @Autowired
    private KeBieTransformer keBieTransformer;

    @Autowired
    private MajorTransformer majorTransformer;

    @Autowired
    private YearTransformer yearTransformer;

    @Autowired
    private UniversityTransformer universityTransformer;

    @Override
    public List<CityBo> getAllCitys() {
        List<CityPo> cityPos = mapper.getAllCitys();

        return cityTransformer.toCityBos(cityPos);
    }

    @Override
    public List<UniversityBo> getAllUniversitys() {
        List<UniversityPo> universityPos = mapper.getAllUniversitys();

        return universityTransformer.toUniversityBos(universityPos);
    }

    @Override
    public List<YearBo> getAllYears() {
        List<YearPo> yearPos = mapper.getAllYeaars();

        return yearTransformer.toYearBos(yearPos);
    }

    @Override
    public List<MajorBo> getAllMajors() {
        List<MajorPo> majorBos = mapper.getAllMajors();

        return majorTransformer.toMajorPos(majorBos);
    }

    @Override
    public List<KeBieBo> getAllKeBies() {
        List<KeBiePo> keBiePos = mapper.getAllKeBies();

        return keBieTransformer.toKeBieBos(keBiePos);
    }
}
