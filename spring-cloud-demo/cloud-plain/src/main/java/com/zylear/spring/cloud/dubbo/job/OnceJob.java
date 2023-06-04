package com.zylear.spring.cloud.dubbo.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xiezongyu
 * @date 2020/8/19
 */
public class OnceJob implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OnceJob.class);

    @Autowired
    private SimpleJob simpleJob;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        logger.info("onceJob data:{} object:{}", jobExecutionContext.getMergedJobDataMap(), simpleJob);


    }
}
