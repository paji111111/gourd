package com.example.mybatis.quartz.service;

import com.example.mybatis.quartz.db.JobParamsDb;
import com.example.mybatis.quartz.db.dao.JobParamsDbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by liuzhixin on 2018/8/25.
 */
@Service
public class TaskJobParamsService {

    @Autowired
    private JobParamsDbDao jobParamsDbDao;


    public Long addJobParams(String name, Long jobDefineId, String description) {
        JobParamsDb jobParamsDb = new JobParamsDb();

        jobParamsDb.setName(name);
        jobParamsDb.setJobDefineId(jobDefineId);
        jobParamsDb.setStatus(0);
        jobParamsDb.setCreated(new Date().getTime());
        jobParamsDb.setDeleted(0);
        jobParamsDb.setDescription(description);

        jobParamsDbDao.insert(jobParamsDb);

        return jobParamsDb.getId();
    }


}
