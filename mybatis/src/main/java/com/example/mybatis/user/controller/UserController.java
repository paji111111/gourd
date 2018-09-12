package com.example.mybatis.user.controller;


import com.example.mybatis.user.model.User;
import com.example.mybatis.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService service;

    @RequestMapping
    public String create() {
        return "create";
    }


    @RequestMapping("/create")
    public String createUser() {
        logger.info(" ================== ");
        User userModel = new User();
        userModel.setPassword("password");
        userModel.setPhone("12345678900");
        userModel.setUserName("作者");
        service.createUser(userModel);
        return "SUCCESS";
    }

    @RequestMapping("/get")
    public User createUser(Long userId) {
        logger.info(" ================== ");
        User userModel = new User();
        userModel.setPassword("password");
        userModel.setPhone("12345678900");
        userModel.setUserName("作者");
        service.createUser(userModel);
        return userModel;
    }

}