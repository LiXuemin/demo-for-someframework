package com.lxm.eshop.cache.ha.hystrix.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;


/**
 * 信号量隔离demo
 **/
public class GetCityNameCommand extends HystrixCommand<String> {
    private String name;
    public GetCityNameCommand(String name) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExamGroup"))
            .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.SEMAPHORE)));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {
        return name;
    }
}
