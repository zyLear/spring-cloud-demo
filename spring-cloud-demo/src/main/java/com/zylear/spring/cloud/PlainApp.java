package com.zylear.spring.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlainApp {

    private static final Logger logger = LoggerFactory.getLogger(PlainApp.class);

    public static void main(String[] args) {
        logger.info("plain app");

        Test selfInitializer = new PlainApp().getSelfInitializer();
        System.out.println(selfInitializer);
        selfInitializer.gg("");

    }


    private Test getSelfInitializer() {
        return this::wdfwdfdsf;
    }

    private void wdfwdfdsf(String x) {
        for (int i = 0; i < 2; i++) {
            System.out.println("inner");
        }
    }


    public interface Test {

        void gg(String x);
    }

}
