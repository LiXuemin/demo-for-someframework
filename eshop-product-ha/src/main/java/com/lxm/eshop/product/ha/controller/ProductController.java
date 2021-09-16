package com.lxm.eshop.product.ha.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.lxm.eshop.product.ha.entity.ProductEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 商品服务
 **/
@RestController
public class ProductController {
    private JsonMapper jsonMapper = JsonMapper.builder().build();

    @RequestMapping("/getProductInfo")
    public String getProductInfo(Long productId) throws JsonProcessingException {
        ProductEntity productEntity = new ProductEntity(productId);
        return jsonMapper.writeValueAsString(productEntity);
    }
}
