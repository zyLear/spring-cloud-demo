package com.zylear.spring.cloud.plain.job;

import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xiezongyu
 * @date 2020/8/18 18:05
 */
@Component
public class SimpleJob {

    private static final Logger logger = LoggerFactory.getLogger(SimpleJob.class);

    public void execute() {

        logger.info("Main Task begin");

    }

}
