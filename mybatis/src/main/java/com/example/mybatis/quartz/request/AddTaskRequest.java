package com.example.mybatis.quartz.request;

import java.util.List;

/**
 * Created by liuzhixin on 2018/8/23.
 */
public class AddTaskRequest {

    private String taskName;
    private String cron;
    private String jobClassName;
    private List<String> paramNames;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public List<String> getParamNames() {
        return paramNames;
    }

    public void setParamNames(List<String> paramNames) {
        this.paramNames = paramNames;
    }
}
