package com.lixuemin.mock;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lixuemin.mock.event.Wish;
import org.junit.jupiter.api.Test;


public class WishTest {
    private static final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    @Test
    public void test() {
        MockConfig mockConfig = new MockConfig().subConfig("number")
            .sizeRange(4, 5)
            .subConfig("wish")
            .sizeRange(8, 15)
            .subConfig("age")
            .shortRange((short) 6,(short)9)
            .subConfig("status")
            .shortRange((short)1,(short)3)
            .subConfig("familyIntro")
            .sizeRange(50, 150)
            .subConfig("address")
            .sizeRange(30, 50)
            .globalConfig();
        for (int i = 0; i < 100; i++) {
            Wish wish = JMockData.mock(Wish.class, mockConfig);
            wish.setVolunteerName("");
            wish.setVolunteerId("");
            wish.setVolunteerPhone("");
            wish.setVolunteerPhoto("");
            System.out.println(gson.toJson(wish));
        }
    }
}