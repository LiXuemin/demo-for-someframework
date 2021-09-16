package com.lxm.eshop.cache.ha.controller;

import cn.hutool.http.HttpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 缓存操作
 **/
@RestController
public class CacheController {

    @RequestMapping("/change/product")
    public String changeProduct(Long productId) {
        String url = "http://127.0.0.1:8082/getProductInfo?productId=" + productId;
        String result = HttpUtil.get(url);
        return result;
    }
}
