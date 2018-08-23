package com.example.mybatis.quartz.service;

import com.example.mybatis.quartz.job.JobTask;
import com.example.mybatis.quartz.job.JobTaskWorkFlow;
import com.example.mybatis.quartz.job.MyTest;
import com.example.mybatis.quartz.job.MyTestParams;
import org.apache.commons.collections4.MapUtils;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuzhixin on 2018/8/22.
 */
@Service
public class QuartzTaskService {

    @Autowired
    private Scheduler scheduler;

    private JobTaskWorkFlow createJobTaskWorkFlow(){
        JobTaskWorkFlow jobTaskWorkFlow = new JobTaskWorkFlow();
        jobTaskWorkFlow.setId(1L);
        jobTaskWorkFlow.setName("workFlow1");

        return jobTaskWorkFlow;
    }

    private JobTask createJobTask(Long i){
        String cron = "0 0/1 * * * ?";//定时的时间设置
        JobTask jobTask = new JobTask();
        jobTask.setId(i);
        jobTask.setName("task"+i);

        if (i % 2 == 0 ) {
            jobTask.setJobClass(MyTestParams.class.getName());
            jobTask.getParamMap().put("a", 1);
            jobTask.getParamMap().put("b", "b");
            jobTask.getParamMap().put("c", 100L);
        }else{
            jobTask.setJobClass(MyTest.class.getName());
        }

        jobTask.setCron(cron);
        jobTask.setJobTaskWorkFlow(createJobTaskWorkFlow());

        return jobTask;
    }

    public void addmyTestJob(Long i) {
        JobTask jobTask = createJobTask(i);
        addCommonCronJob(jobTask);
    }

    /**
     * 添加一些定时任务，如日志清理任务
     */
    private void addCommonCronJob(JobTask jobTask) {
        try {
            String jobName = jobTask.getName();
            String jobGroup = jobTask.getJobTaskWorkFlow().getName();
            TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);
            //任务触发
            Trigger checkExist = (CronTrigger) scheduler.getTrigger(triggerKey);
            if (checkExist == null) {
                JobDetail jobDetail = JobBuilder.newJob((Class<? extends Job>) Class.forName(jobTask.getJobClass()))
                        .requestRecovery(true)//当Quartz服务被中止后，再次启动或集群中其他机器接手任务时会尝试恢复执行之前未完成的所有任务
                        .withIdentity(jobName, jobGroup)
                        .build();
                jobDetail.getJobDataMap().put("jobName", jobName);
                jobDetail.getJobDataMap().put("jobGroup", jobGroup);
                if (MapUtils.isNotEmpty(jobTask.getParamMap())){
                    jobDetail.getJobDataMap().putAll(jobTask.getParamMap());
                }
                CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(jobTask.getCron());
                /*withMisfireHandlingInstructionDoNothing
                ——不触发立即执行
                ——等待下次Cron触发频率到达时刻开始按照Cron频率依次执行
                withMisfireHandlingInstructionIgnoreMisfires
                ——以错过的第一个频率时间立刻开始执行
                ——重做错过的所有频率周期后
                ——当下一次触发频率发生时间大于当前时间后，再按照正常的Cron频率依次执行
                withMisfireHandlingInstructionFireAndProceed
                ——以当前时间为触发频率立刻触发一次执行
                ——然后按照Cron频率依次执行*/
                Trigger trigger = TriggerBuilder.newTrigger()
                        .withIdentity(jobName, jobGroup)
                        .withSchedule(cronScheduleBuilder.withMisfireHandlingInstructionIgnoreMisfires())
                        .build();
                scheduler.scheduleJob(jobDetail, trigger);
            } else {
                scheduler.deleteJob(JobKey.jobKey(jobName, jobGroup));
                addCommonCronJob(jobTask);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
