package com.lixuemin.algo.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SortTemplateTest {
    @Test
    public void testBubbleSort(){
        final int[] ints = BubbleSort1.sort(SortingUtil.arr1, SortingUtil.arr1.length);
        SortingUtil.assertOrder(ints);
        SortingUtil.printArray(ints);
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, ints);
    }

}
