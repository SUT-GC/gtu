package com.igouc.gtuapi;

import com.igouc.gtuapi.dto.GtuGaoxiaoFenshuDTO;
import com.igouc.service.GaoXiaoFenShuService;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
}
