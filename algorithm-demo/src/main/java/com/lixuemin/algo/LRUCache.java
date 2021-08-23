package com.lixuemin.algo;

import java.util.LinkedHashMap;


/**
 *
 **/
class LRUCache {
    private LinkedHashMap<Integer, Integer> map;
    private int capacity;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (map.size() == capacity) {
            removeLRU();
        }
        map.put(key, value);
    }

    private void removeLRU() {

    }
}