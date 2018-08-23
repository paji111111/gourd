package com.example.mybatis.quartz.db;

/**
 * Created by liuzhixin on 2018/8/23.
 */
public class JobParamsDb {
    private Long id;
    private String name;
    private Long jobDefineId;
    private Integer status;
    private Long created;
    private Integer deleted;    // 删除标记

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

    public Long getJobDefineId() {
        return jobDefineId;
    }

    public void setJobDefineId(Long jobDefineId) {
        this.jobDefineId = jobDefineId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}
