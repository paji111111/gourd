package com.example.mybatis.user.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping
    public String index() {
        logger.info("-----------------------");
        return "SUCCESS";
    }
}
