package com.example.mybatis.quartz.db;

/**
 * Created by liuzhixin on 2018/8/21.
 */
public class JobDefineDb {
    private Long id;
    private String name; // 任务名称
    private Long jobFlowId; // 流id
    private Integer sn;     // 执行顺序号
    private Integer status; // 状态
    private String cron;    // 规定执行时间
    private Long created;   // 创建时间
    private Integer deleted;    // 删除标记
    private String description; // 描述
    private String jobClassName;

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

    public Long getJobFlowId() {
        return jobFlowId;
    }

    public void setJobFlowId(Long jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }
}
