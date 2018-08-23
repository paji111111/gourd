package com.example.mybatis.quartz.db.dao;

import com.example.mybatis.quartz.db.JobDefineDb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by liuzhixin on 2018/8/23.
 */
@Mapper
public interface JobDefineDbDao {

    List<JobDefineDb> selectBySelective(JobDefineDb jobDefineDb);

    JobDefineDb selectByPrimaryKey(Long id);

    int insert(JobDefineDb record);

    int updateByPrimaryKeySelective(JobDefineDb jobDefineDb);

}
