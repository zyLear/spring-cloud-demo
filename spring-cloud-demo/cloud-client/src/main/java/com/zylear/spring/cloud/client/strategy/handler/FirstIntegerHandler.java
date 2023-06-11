package com.zylear.spring.cloud.client.strategy.handler;

import com.zylear.spring.cloud.client.strategy.StrategyHandler;
import org.springframework.stereotype.Component;

@Component
public class FirstIntegerHandler implements StrategyHandler<Integer> {
    @Override
    public boolean support(Integer param) {
        return "1".equals(String.valueOf(param));
    }

    @Override
    public void handle(Integer param) {
        System.out.println("handle: " + param);
    }
}
