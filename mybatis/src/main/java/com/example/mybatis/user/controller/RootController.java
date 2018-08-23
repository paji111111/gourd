package com.example.mybatis.user.controller;


import com.example.mybatis.quartzs.service.QuartzTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    QuartzTaskService quartzTaskService;

    @RequestMapping
    public String index() {
        logger.info("-----------------------");
        return "SUCCESS";
    }

    @RequestMapping("/createTask")
    public String createTask() {
        logger.info("-----------------------");


        quartzTaskService.addmyTestJob(Fac.atomicLong.getAndIncrement());

        return "SUCCESS";
    }
}
