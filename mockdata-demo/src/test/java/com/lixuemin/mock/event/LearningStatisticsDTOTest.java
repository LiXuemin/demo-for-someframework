package com.lixuemin.mock.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 *
 **/
class LearningStatisticsDTOTest {
    @Test
    void build(){
        LearningStatisticsDTO.builder().userId(40L).build();
    }

}