package com.example.mybatis.quartz.job;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyTestParams implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {


        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();

        System.out.println("MyTestParams execute params :  "+jobDataMap);

    }
}
