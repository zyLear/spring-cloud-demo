package com.zylear.spring.cloud.client.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

public class AbstractStrategyContext<T> {

    @Autowired
    private List<StrategyHandler<T>> strategyHandlers;

    @PostConstruct
    private void init() {
        System.out.println("init: " + strategyHandlers);
    }

    public void handle(T param) {
        for (StrategyHandler<T> strategyHandler : strategyHandlers) {
            if (strategyHandler.support(param)) {
                strategyHandler.handle(param);
                return;
            }
        }
    }

}
