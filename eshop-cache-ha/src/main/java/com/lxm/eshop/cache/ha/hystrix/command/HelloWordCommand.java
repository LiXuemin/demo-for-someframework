package com.lxm.eshop.cache.ha.hystrix.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;


/**
 * https://github.com/Netflix/Hystrix/wiki/Getting-Started
 **/
public class HelloWordCommand extends HystrixCommand<String> {
    private final String name;

    public HelloWordCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("HelloGroup"));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {
        return "hello," + name;
    }
}
