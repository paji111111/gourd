package com.example.mybatis.quartz.db.dao;

import com.example.mybatis.quartz.db.JobFlowDb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liuzhixin on 2018/8/23.
 */
@Mapper
public interface JobFlowDbDao {
    List<JobFlowDb> selectBySelective(JobFlowDb jobFlowDb);

    JobFlowDb selectByPrimaryKey(Long id);

    int insert(JobFlowDb jobFlowDb);

    int updateByPrimaryKeySelective(JobFlowDb jobFlowDb);
}
