package com.lxm.eshop.cache.ha.hystrix.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;


/**
 *
 **/
public class HelloFailureCommand extends HystrixCommand<String> {
    private final String name;

    protected HelloFailureCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("HelloFailureGroup"));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {
        throw new RuntimeException("sorry, i am always failure.");
   }

    @Override
    protected String getFallback() {
        return "Failure," + name;
    }
}
