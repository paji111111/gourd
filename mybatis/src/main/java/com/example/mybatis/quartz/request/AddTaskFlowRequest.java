package com.example.mybatis.quartz.request;

/**
 * Created by liuzhixin on 2018/8/25.
 */
public class AddTaskFlowRequest {

    private String name;
    private Integer status;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "AddTaskFlowRequest{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }
}
