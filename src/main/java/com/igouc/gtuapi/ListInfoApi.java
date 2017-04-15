package com.igouc.gtuapi;

import com.igouc.gtuapi.dto.ListInfoDTO;
import com.igouc.service.ListInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listinfo")
public class ListInfoApi {
    @Autowired
    private ListInfoService listInfoService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public ListInfoDTO getListInfo() {
        return listInfoService.getListInfo();
    }
}
