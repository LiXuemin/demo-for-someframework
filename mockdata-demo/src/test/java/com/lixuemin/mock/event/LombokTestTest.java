package com.lixuemin.mock.event;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LombokTestTest {

    @Test
    void getId() {
        LombokTest test = new LombokTest();
        test.setId("123");
        assertEquals("123", test.getId());
    }
}