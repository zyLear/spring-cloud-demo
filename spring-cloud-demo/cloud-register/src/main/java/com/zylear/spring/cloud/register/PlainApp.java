package com.zylear.spring.cloud.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlainApp {

    private static final Logger logger = LoggerFactory.getLogger(PlainApp.class);

    public static void main(String[] args) {
        logger.info("plain app");  // conflict 1

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

        static int a = 1;

        abstract void gg(String x);
    }



}
 abstract class TESt11 {

    static int g1g(String x){
        return 1;
    }

    abstract void gg(String x);
}