package com.igouc.gtuapi;

import com.igouc.gtuapi.dto.GtuGaoxiaoFenshuDTO;
import com.igouc.gtuapi.dto.UniversityDTO;
import com.igouc.service.GaoXiaoFenShuService;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/gaoxiaofenshu")
public class GaoXiaoFenShuApi {

    @Autowired
    private GaoXiaoFenShuService gaoXiaoFenShuService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(HttpServletRequest request) {
        return "hello gaoxiaofenshu";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public String getGtuGaoXianFenShuById(@PathVariable Integer id, HttpServletRequest request) {
        GtuGaoxiaoFenshuDTO gtuGaoxiaoFenshuDTO = gaoXiaoFenShuService.getGaoXiaoFenShuById(id);


        return gtuGaoxiaoFenshuDTO == null ? "" : gtuGaoxiaoFenshuDTO.toJsonString();
    }

    @RequestMapping(value = "/cdx", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public List<UniversityDTO> getGaoXiaoXinXi(@RequestParam(value = "cityName") String cityName, @RequestParam(value = "kebie") String kebie, @RequestParam(value = "year") String year) {

        return gaoXiaoFenShuService.seleteGaoXiaoXin(cityName, kebie, year);
    }

    @RequestMapping(value = "/score", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public List<UniversityDTO> selectByScore(String cityName, String score, String year) {

        return gaoXiaoFenShuService.selectByScore(cityName, score, year);
    }

    @RequestMapping(value = "/cityscore", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public List<UniversityDTO> selectCityScore(String cityName, String keBie, String year) {

        return gaoXiaoFenShuService.selectCityScore(cityName, keBie, year);
    }

    @RequestMapping(value = "/university/{universityName}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public List<UniversityDTO> selectByUniversityName(@PathVariable String universityName) {

        return gaoXiaoFenShuService.selectByUniversityName(universityName);
    }
}
