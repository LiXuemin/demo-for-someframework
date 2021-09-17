package com.lxm.eshop.cache.ha.hystrix.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 *
 **/
class HelloFailureCommandTest {

    @Test
    public void shouldExecuteFallback(){
        String name = "lixuemin";
        //assertThrows(RuntimeException.class, ()-> {new HelloFailureCommand(name).execute();});
        assertEquals("Failure," + name, new HelloFailureCommand(name).execute());
    }

}