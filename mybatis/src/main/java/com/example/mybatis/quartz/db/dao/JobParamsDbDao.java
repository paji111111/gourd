package com.example.mybatis.quartz.db.dao;

import com.example.mybatis.quartz.db.JobParamsDb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liuzhixin on 2018/8/23.
 */
@Mapper
public interface JobParamsDbDao {
    List<JobParamsDb> selectBySelective(JobParamsDb jobParamsDb);

    JobParamsDb selectByPrimaryKey(Long id);

    int insert(JobParamsDb jobParamsDb);

    int updateByPrimaryKeySelective(JobParamsDb jobParamsDb);
}
