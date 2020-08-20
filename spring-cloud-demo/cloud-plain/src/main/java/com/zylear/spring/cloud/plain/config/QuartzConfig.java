package com.zylear.spring.cloud.plain.config;

import com.zylear.spring.cloud.plain.job.SimpleJob;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;

@Configuration
public class QuartzConfig {

    @Value("${quartz.cron.expression:0/30 * * * * ?}")
    private String cronExpression;

    @Bean
    public MethodInvokingJobDetailFactoryBean jobDetail(SimpleJob simpleJob) {
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
        jobDetail.setTargetObject(simpleJob);
        jobDetail.setTargetMethod("execute");
        jobDetail.setConcurrent(false);
        return jobDetail;
    }

    @Bean
    public CronTriggerFactoryBean mainTrigger(JobDetail jobDetail) {
        CronTriggerFactoryBean mainTrigger = new CronTriggerFactoryBean();
        mainTrigger.setJobDetail(jobDetail);
        mainTrigger.setCronExpression(cronExpression);
        return mainTrigger;
    }

    @Bean("quartzScheduler")
    public SchedulerFactoryBean schedulerFactoryBean(Trigger mainTrigger) {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setTriggers(mainTrigger);
        schedulerFactoryBean.setJobFactory(new SpringBeanJobFactory());
        return schedulerFactoryBean;
    }

}
