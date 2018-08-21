package com.example.mybatis.quartzs.db;

/**
 * Created by liuzhixin on 2018/8/21.
 */
public class JobDefineDb {
    private Long id;
    private String jobName; // 任务名称
    private Long jobFlowId; // 流id
    private Integer sn;     // 执行顺序号
    private Integer status; // 状态
    private String cron;    // 规定执行时间
    private Long created;   // 创建时间
    private Integer deleted;    // 删除标记
}
