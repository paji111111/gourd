package com.example.mybatis.quartz.service;

import com.example.mybatis.quartz.db.JobDefineDb;
import com.example.mybatis.quartz.db.dao.JobDefineDbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by liuzhixin on 2018/8/25.
 */
@Service
public class TaskJobService {

    @Autowired
    private JobDefineDbDao jobDefineDbDao;


    public Long addJobDefine(String name, Long jobFlowId, String cron, String jobClassName, String description) {
        JobDefineDb jobDefineDb = new JobDefineDb();
        jobDefineDb.setName(name);
        jobDefineDb.setJobFlowId(jobFlowId);
        jobDefineDb.setSn(1);
        jobDefineDb.setStatus(0);
        jobDefineDb.setCron(cron);
        jobDefineDb.setCreated(new Date().getTime());
        jobDefineDb.setDeleted(0);
        jobDefineDb.setDescription(description);
        jobDefineDb.setJobClassName(jobClassName);

        jobDefineDbDao.insert(jobDefineDb);
        return jobDefineDb.getId();
    }
}
