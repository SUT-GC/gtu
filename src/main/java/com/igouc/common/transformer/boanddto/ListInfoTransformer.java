package com.igouc.common.transformer.boanddto;

import com.igouc.gtuapi.dto.ListInfoDTO;
import com.igouc.service.bo.*;

import java.util.List;
import java.util.stream.Collectors;

public class ListInfoTransformer {
    public ListInfoDTO toListInfoDTO(List<CityBo> citys, List<YearBo> years, List<MajorBo> majors, List<KeBieBo> kebies, List<UniversityBo> universitys) {
        ListInfoDTO dto = new ListInfoDTO();
        dto.setAllCity(citys.stream().map(CityBo::getCityName).collect(Collectors.toList()));
        dto.setAllKeBie(kebies.stream().map(KeBieBo::getKebie).collect(Collectors.toList()));
        dto.setAllMajor(majors.stream().map(MajorBo::getMajor).collect(Collectors.toList()));
        dto.setAllUniversity(universitys.stream().map(UniversityBo::getUniversityName).collect(Collectors.toList()));
        dto.setAllYears(years.stream().map(YearBo::getYear).collect(Collectors.toList()));

        return dto;
    }
}
