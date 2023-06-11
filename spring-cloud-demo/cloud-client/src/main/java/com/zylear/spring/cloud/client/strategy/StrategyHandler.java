package com.zylear.spring.cloud.client.strategy;

public interface StrategyHandler<T> {

    boolean support(T t);

    void handle(T t);

}
