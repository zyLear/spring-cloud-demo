package com.zylear.spring.cloud.plain.manager.common;

import com.zylear.spring.cloud.plain.job.OnceJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * @author xiezongyu
 * @date 2020/8/19
 */
@Component
public class QuartzManager {

    private static final Logger logger = LoggerFactory.getLogger(OnceJob.class);


//    @Autowired
//    private Scheduler scheduler;

    @PostConstruct
    private void init() throws SchedulerException {

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        JobDetail jobDetail = JobBuilder.newJob(OnceJob.class).withIdentity("job1").build();
        jobDetail.getJobDataMap().put("data", "jobData");
        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("trigger11")
                .startAt(new Date(System.currentTimeMillis() + 30000))
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withRepeatCount(0)).build();
        // 还可以设置cron schedule
        // CronScheduleBuilder.cronSchedule("* 111").build();
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();

        logger.info("add job success.");
    }

}
