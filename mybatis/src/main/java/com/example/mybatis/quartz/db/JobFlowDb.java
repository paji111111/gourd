package com.example.mybatis.quartz.db;

/** 工作流程定义 目的为了顺序执行一个一个的工作
 * Created by liuzhixin on 2018/8/21.
 */

public class JobFlowDb {
    private Long id;
    private String name;
    private Integer status;
    private Integer deleted;
    private Long created;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }
}
