package com.igouc.gtuapi;

import com.igouc.gtuapi.dto.ZhuanYeDTO;
import com.igouc.service.ZhuanYeFenShuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zhuanye")
public class ZhuanYeFenShuApi {
    @Autowired
    private ZhuanYeFenShuService zhuanYeFenShuService;

    @RequestMapping(value = "/{majorName}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public List<ZhuanYeDTO> getZhuanYe(@PathVariable String majorName) {
        return zhuanYeFenShuService.getZhuanYe(majorName);
    }

    @RequestMapping(value = "/majorscore", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public List<ZhuanYeDTO> selectZhuanYeScore(String majorName, String cityName, String year) {
        return zhuanYeFenShuService.selectZhuanYeScore(majorName, cityName, year);
    }

    @RequestMapping(value = "/majorinuni/{universityName}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public List<ZhuanYeDTO> selectMajorInUniversity(@PathVariable String universityName) {
        return zhuanYeFenShuService.selectMajorInUniversity(universityName);
    }
}
