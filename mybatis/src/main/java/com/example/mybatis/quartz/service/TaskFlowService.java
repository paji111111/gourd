package com.example.mybatis.quartz.service;

import com.example.mybatis.quartz.db.JobFlowDb;
import com.example.mybatis.quartz.db.dao.JobFlowDbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by liuzhixin on 2018/8/25.
 */
@Service
public class TaskFlowService {

    @Autowired
    private JobFlowDbDao jobFlowDbDao;

    public Long addTaskFlow(String name, Integer status, String description) {
        JobFlowDb jobFlowDb = new JobFlowDb();
        jobFlowDb.setName(name);
        jobFlowDb.setStatus(status);
        jobFlowDb.setDescription(description);

        jobFlowDb.setCreated(new Date().getTime());
        jobFlowDb.setDeleted(0);

        jobFlowDbDao.insert(jobFlowDb);

        return jobFlowDb.getId();
    }


    public List<JobFlowDb> getAll() {
        return jobFlowDbDao.selectBySelective(new JobFlowDb());
    }
}
