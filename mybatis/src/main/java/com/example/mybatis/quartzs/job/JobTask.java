package com.example.mybatis.quartzs.job;


public class JobTask {
    private Long id;
    private String name;
    private String cron;
    private String jobClass;
    private JobTaskWorkFlow jobTaskWorkFlow;
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

    public JobTaskWorkFlow getJobTaskWorkFlow() {
        return jobTaskWorkFlow;
    }

    public void setJobTaskWorkFlow(JobTaskWorkFlow jobTaskWorkFlow) {
        this.jobTaskWorkFlow = jobTaskWorkFlow;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
