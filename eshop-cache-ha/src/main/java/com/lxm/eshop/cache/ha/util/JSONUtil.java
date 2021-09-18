package com.lxm.eshop.cache.ha.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.util.List;


/**
 *
 **/
public class JSONUtil {
    private static final JsonMapper JSON_MAPPER = JsonMapper.builder().build();

    public static String JSONString(Object obj) throws JsonProcessingException {
        return JSON_MAPPER.writeValueAsString(obj);
    }

    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = JSON_MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
        JavaType javaType = JSON_MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            List<T> list = JSON_MAPPER.readValue(jsonData, javaType);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
