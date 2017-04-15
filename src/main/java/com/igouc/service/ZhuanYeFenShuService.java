package com.igouc.service;

import com.igouc.gtuapi.dto.ZhuanYeDTO;
import com.igouc.repository.GtuZhuanYeFenShuRepository;
import com.igouc.repository.ZhuanYeXinXiRepository;
import com.igouc.service.bo.GtuZhuanYeFenShuBo;
import com.igouc.service.bo.ZhuanYeXinXiBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZhuanYeFenShuService {

    @Autowired
    private GtuZhuanYeFenShuRepository repository;
    @Autowired
    private ZhuanYeXinXiRepository zhuanYeXinXiRepository;

    public List<ZhuanYeDTO> getZhuanYe(String zhuanYeMing) {
        List<GtuZhuanYeFenShuBo> bos = repository.getZhuanYe(zhuanYeMing);

        return toZhuanYeDTO(bos);
    }

    public List<ZhuanYeDTO> selectZhuanYeScore(String majorName, String cityName, String year) {
        List<GtuZhuanYeFenShuBo> bos = repository.selectZhuanYeScore(majorName, cityName, year);

        return toZhuanYeDTO(bos);
    }

    public List<ZhuanYeDTO> selectMajorInUniversity(String universityName) {
        List<GtuZhuanYeFenShuBo> bos = repository.selectMajorInUniversity(universityName);

        return toZhuanYeDTO(bos);
    }

    private List<ZhuanYeDTO> toZhuanYeDTO(List<GtuZhuanYeFenShuBo> bos) {
        List<ZhuanYeDTO> dtos = new ArrayList<>();

        for (GtuZhuanYeFenShuBo bo : bos) {
            ZhuanYeDTO dto = new ZhuanYeDTO();
            dto.setMajorName(bo.getZhuanYeMing());
            dto.setCityName(bo.getKaoShengQu());
            dto.setUniversityName(bo.getDaXueMing());
            dto.setAvgScore(bo.getPingJunFen());
            dto.setPici(bo.getPiCi());
            dto.setYear(bo.getNianFen());
            ZhuanYeXinXiBo zhuanYeXinXiBo = zhuanYeXinXiRepository.getZhuanYeXinXi(bo.getZhuanYeMing());
            dto.setMajorUrl(zhuanYeXinXiBo.getZhuanYeUrl());
            dtos.add(dto);
        }

        return dtos;
    }

}
