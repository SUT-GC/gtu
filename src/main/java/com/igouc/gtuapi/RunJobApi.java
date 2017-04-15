package com.igouc.gtuapi;

import com.igouc.service.RunJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/runjob")
public class RunJobApi {

    @Autowired
    private RunJobService runJobService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public String hello() {
        return "hello runjob";
    }

    @RequestMapping(value = "/{jobId}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public void runJob(@PathVariable Integer jobId) {
        runJobService.runJob(jobId);
    }
}
