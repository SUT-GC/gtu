package com.igouc.service;

import com.igouc.common.transformer.boanddto.ListInfoTransformer;
import com.igouc.gtuapi.dto.ListInfoDTO;
import com.igouc.repository.ListInfoRepository;
import com.igouc.repository.po.MajorPo;
import com.igouc.service.bo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListInfoService {

    @Autowired
    private ListInfoRepository listInfoRepository;

    @Autowired
    private ListInfoTransformer transformer;

    public ListInfoDTO getListInfo() {
        List<MajorBo> majorBos = listInfoRepository.getAllMajors();
        List<UniversityBo> universityBos = listInfoRepository.getAllUniversitys();
        List<CityBo> cityBos = listInfoRepository.getAllCitys();
        List<KeBieBo> keBieBos = listInfoRepository.getAllKeBies();
        List<YearBo> yearBos = listInfoRepository.getAllYears();

        return transformer.toListInfoDTO(cityBos, yearBos, majorBos, keBieBos, universityBos);
    }
}
