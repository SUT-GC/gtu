package com.igouc.service;

import com.igouc.common.transformer.boanddto.GtuGaoXiaoFenShuDTOTransformer;
import com.igouc.gtuapi.dto.GtuGaoxiaoFenshuDTO;
import com.igouc.gtuapi.dto.UniversityDTO;
import com.igouc.repository.GaoXiaoXinXiRepository;
import com.igouc.repository.GtuGaoXiaoFenShuRepository;
import com.igouc.service.bo.GaoXiaoXinXiBo;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GaoXiaoFenShuService {

    @Autowired
    private GtuGaoXiaoFenShuRepository gtuGaoXiaoFenShuRepository;
    @Autowired
    private GtuGaoXiaoFenShuDTOTransformer transformer;
    @Autowired
    private GaoXiaoXinXiRepository gaoXiaoXinXiRepository;

    private static final Logger LOG = Logger.getLogger(GaoXiaoFenShuService.class);

    public GtuGaoxiaoFenshuDTO getGaoXiaoFenShuById(Integer id) {
        GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo = gtuGaoXiaoFenShuRepository.getGtuGaoXiaoFenShuById(id);
        GtuGaoxiaoFenshuDTO gtuGaoxiaoFenshuDTO = transformer.Bo2Dto(gtuGaoXiaoFenShuBo);

        return gtuGaoxiaoFenshuDTO;
    }

    public List<UniversityDTO> seleteGaoXiaoXin(String cityName, String kebie, String year) {
        List<GtuGaoXiaoFenShuBo> gtuGaoXiaoFenShuBos = gtuGaoXiaoFenShuRepository.getGaoXiaoInfo(cityName, kebie, year);

        return toUniversityDto(gtuGaoXiaoFenShuBos);
    }

    public List<UniversityDTO> selectByScore(String cityName, String score, String year) {
        List<GtuGaoXiaoFenShuBo> gtuGaoXiaoFenShuBos = gtuGaoXiaoFenShuRepository.selectByScore(cityName, score, year);

        return toUniversityDto(gtuGaoXiaoFenShuBos);
    }

    public List<UniversityDTO> selectCityScore(String cityName, String keBie, String year) {
        List<GtuGaoXiaoFenShuBo> gtuGaoXiaoFenShuBos = gtuGaoXiaoFenShuRepository.selectCityScore(cityName, keBie, year);

        return toUniversityDto(gtuGaoXiaoFenShuBos);
    }

    public List<UniversityDTO> selectByUniversityName(String universityName) {
        List<GtuGaoXiaoFenShuBo> gtuGaoXiaoFenShuBos = gtuGaoXiaoFenShuRepository.getGtuGaoXiaoFenShuByDaXueMing(universityName);

        return toUniversityDto(gtuGaoXiaoFenShuBos);
    }

    private List<UniversityDTO> toUniversityDto(List<GtuGaoXiaoFenShuBo> gtuGaoXiaoFenShuBos) {
        List<UniversityDTO> universitys = new ArrayList<>();

        for (GtuGaoXiaoFenShuBo bo : gtuGaoXiaoFenShuBos) {
            UniversityDTO universityDTO = new UniversityDTO();
            universityDTO.setUniversityName(bo.getDaXueMing());
            universityDTO.setCityName(bo.getZhaoShengQu());
            universityDTO.setKebie(bo.getKeBie());
            universityDTO.setPici(bo.getPiCi());
            universityDTO.setScoreLimit(bo.getKongFenXian());
            GaoXiaoXinXiBo gaoXiaoXinXiBo = gaoXiaoXinXiRepository.getGaoXiaoXinXi(bo.getDaXueMing());
            universityDTO.setUrl(gaoXiaoXinXiBo == null ? "" : gaoXiaoXinXiBo.getGaoXiaoUrl());
            universitys.add(universityDTO);
        }

        return universitys;
    }

}
