package com.lixuemin.mock;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lixuemin.mock.event.LearningEvent;
import com.lixuemin.mock.event.subjective.AehsAnswerDTO;
import org.junit.jupiter.api.Test;


/**
 * @program: demo-for-someframework
 * @description:
 * @author: lixuemin
 * @create: 2021-05-26
 **/
public class SubjectivePracticeTest {
    private static final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    @Test
    public void testGenerateBeanWithConfig() {
        int[] ints = new int[]{1, 0};
        MockConfig mockConfig = new MockConfig()
            .subConfig("learnStatus")
            .intRange(100020001, 100020002)
            .subConfig("resType", "pageType", "result")
            .intRange(0, 1)
            .subConfig("learnStartTime", "learnEndTime","recordStartTime","recordEndTime","optTime")
            .longRange(1615448379000L, 1620718779425L)
            .globalConfig();
        AehsAnswerDTO aehsAnswerDTO = JMockData.mock(AehsAnswerDTO.class);
        System.out.println(gson.toJson(aehsAnswerDTO));
    }
}
