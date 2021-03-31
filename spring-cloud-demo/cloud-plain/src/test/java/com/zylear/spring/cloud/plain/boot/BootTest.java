package com.zylear.spring.cloud.plain.boot;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiezongyu
 * @date 2021/3/3
 */
public class BootTest {

    @Test
    public void boot() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BootTest.class);

    }

}
