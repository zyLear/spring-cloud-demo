package com.zylear.spring.cloud.client.strategy.handler;

import com.zylear.spring.cloud.client.strategy.StrategyHandler;
import org.springframework.stereotype.Component;

@Component
public class FirstStringHandler implements StrategyHandler<String> {
    @Override
    public boolean support(String param) {
        return "1".equals(param);
    }

    @Override
    public void handle(String param) {
        System.out.println("handle: " + param);
    }
}
