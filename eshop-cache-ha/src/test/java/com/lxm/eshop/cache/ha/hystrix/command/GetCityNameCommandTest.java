package com.lxm.eshop.cache.ha.hystrix.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 *
 **/
class GetCityNameCommandTest {
    @Test
    public void shouldGetResult(){
        String s = "BBQ";
        String bbq = new GetCityNameCommand(s).execute();
        assertEquals(bbq, s);
    }

    @Test
    public void shouldThrow() {
        String s = "BBQ";
        for (int i = 0; i < 10000; i++) {
            String bbq = new GetCityNameCommand(s).execute();
        }
        //assertEquals(bbq, s);
    }
}