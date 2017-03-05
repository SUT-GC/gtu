package com.igouc.gtuapi;

import com.igouc.service.TestService;
import com.igouc.service.bo.GtuGaoXiaoFenShuBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestApi {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(HttpServletRequest request){
        return "hello world";
    }

    @RequestMapping(value = "/gaoxiaofenshu/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public String getGtuGaoXianFenShuById(@PathVariable Integer id, HttpServletRequest request) {
        GtuGaoXiaoFenShuBo gtuGaoXiaoFenShuBo =  testService.getGaoXiaoFenShuById(id);


        return gtuGaoXiaoFenShuBo == null ? "" : gtuGaoXiaoFenShuBo.toString();
    }
}
