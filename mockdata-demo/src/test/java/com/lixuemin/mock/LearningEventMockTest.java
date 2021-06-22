package com.lixuemin.mock;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lixuemin.mock.event.LearningEvent;
import java.time.Instant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @program: demo-for-someframework
 *
 * @description: test
 *
 * @author: lixuemin
 *
 * @create: 2021-05-07
 **/
public class LearningEventMockTest {
    private static final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    @Test
    public void testGenerateBean() {
        LearningEvent mockLearningEvent = JMockData.mock(LearningEvent.class);
        System.out.println(gson.toJson(mockLearningEvent));
    }

    @Test
    public void testGenerateBeanWithConfig() {
        int[] ints = new int[]{1, 0};
        MockConfig mockConfig = new MockConfig()
//                .subConfig("age")
//                .intRange(1, 100)
//                .subConfig("email")
//                .stringRegex("[a-z0-9]{5,15}\\@\\w{3,5}\\.[a-z]{2,3}")
            .subConfig("learnStatus")
            .intRange(100020001, 100020002)
            .subConfig("resType", "pageType", "result")
            .intRange(0, 1)
            .subConfig("learnStartTime", "learnEndTime","recordStartTime","recordEndTime","optTime")
            .longRange(1615448379000L, 1620718779425L)
            .globalConfig();
        LearningEvent mockLearningEvent = JMockData.mock(LearningEvent.class, mockConfig);
        System.out.println(gson.toJson(mockLearningEvent));
    }

    @Test
    public void assertLearning() {
        long x = 3, y = 4;
        Assertions.assertEquals(x / y, 0);
        Assertions.assertEquals((double) x / (double) y, 0.75);
    }

    @Test
    public void testTime() {
        System.out.println(System.currentTimeMillis());
        System.out.println(Instant.now().toEpochMilli());
    }
}
