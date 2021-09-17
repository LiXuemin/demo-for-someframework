package com.lxm.eshop.cache.ha.hystrix.command;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.junit.jupiter.api.Test;
import rx.Observable;

import static org.junit.jupiter.api.Assertions.*;


/**
 *
 **/
class HelloWordCommandTest {
    @Test
    public void shouldBeEqualName() {
        String name = "lixuemin";
        String s = new HelloWordCommand(name).execute();
        Future<String> future = new HelloWordCommand(name).queue();
        Observable<String> observable = new HelloWordCommand(name).observe();
        assertEquals("hello," + name, s);
    }

    @Test
    public void shouldBeEqualByFuture() throws ExecutionException, InterruptedException {
        String name = "lixuemin";
        Future<String> future = new HelloWordCommand(name).queue();
        Observable<String> observable = new HelloWordCommand(name).observe();
        assertEquals("hello," + name, future.get());
    }

    @Test
    public void shouldBeEqualByObserve() {
        String name = "lixuemin";
        Observable<String> observable = new HelloWordCommand(name).observe();
        assertEquals("hello," + name, observable.toBlocking().single());
    }
}