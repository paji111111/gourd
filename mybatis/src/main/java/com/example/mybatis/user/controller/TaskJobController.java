package com.example.mybatis.user.controller;

import com.example.mybatis.quartz.request.AddTaskRequest;
import com.example.mybatis.quartz.service.TaskJobParamsService;
import com.example.mybatis.quartz.service.TaskJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuzhixin on 2018/8/25.
 */
@RestController
@RequestMapping("/taskjob")
public class TaskJobController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TaskJobService taskJobService;

    @Autowired
    private TaskJobParamsService taskJobParamsService;

    @RequestMapping("/create")
    public String createUser(AddTaskRequest addTaskRequest) {
        logger.info(" ================== "+addTaskRequest);
        Long jobDefineId = taskJobService.addJobDefine(addTaskRequest.getName(), addTaskRequest.getJobFlowId(), addTaskRequest.getCron(), addTaskRequest.getJobClassName(),
                addTaskRequest.getDescription());
        if (jobDefineId > 0){
            for (String paramName: addTaskRequest.getParamNames()){
                taskJobParamsService.addJobParams(paramName, jobDefineId, "jobDefineIdjobDefineId");
            }
        }
        return "SUCCESS";
    }



}
