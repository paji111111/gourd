package com.example.mybatis.user.controller;

import com.example.mybatis.quartz.db.JobFlowDb;
import com.example.mybatis.quartz.request.AddTaskFlowRequest;
import com.example.mybatis.quartz.service.TaskFlowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liuzhixin on 2018/8/25.
 */
@RestController
@RequestMapping("/taskflow")
public class TaskFlowController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TaskFlowService taskFlowService;

    @RequestMapping("/get")
    public List<JobFlowDb> list() {
        logger.info(" ================== ");
        List<JobFlowDb> jobFlowDbList = taskFlowService.getAll();
        return jobFlowDbList;
    }

    @RequestMapping("/create")
    public String createUser(AddTaskFlowRequest addTaskFlowRequest) {
        logger.info(" ================== "+addTaskFlowRequest);
        taskFlowService.addTaskFlow(addTaskFlowRequest.getName(), addTaskFlowRequest.getStatus(), addTaskFlowRequest.getDescription());
        return "SUCCESS";
    }

}
