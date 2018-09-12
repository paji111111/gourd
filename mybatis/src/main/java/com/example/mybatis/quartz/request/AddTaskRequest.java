package com.example.mybatis.quartz.request;

import java.util.List;

/**
 * Created by liuzhixin on 2018/8/23.
 */
public class AddTaskRequest {

    private String name;
    private String cron;
    private Long jobFlowId;
    private String jobClassName;
    private List<String> paramNames;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public Long getJobFlowId() {
        return jobFlowId;
    }

    public void setJobFlowId(Long jobFlowId) {
        this.jobFlowId = jobFlowId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AddTaskRequest{" +
                "name='" + name + '\'' +
                ", cron='" + cron + '\'' +
                ", jobFlowId=" + jobFlowId +
                ", jobClassName='" + jobClassName + '\'' +
                ", paramNames=" + paramNames +
                ", description='" + description + '\'' +
                '}';
    }
}
