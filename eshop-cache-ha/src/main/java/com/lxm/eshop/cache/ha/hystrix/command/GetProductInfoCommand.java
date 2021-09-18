package com.lxm.eshop.cache.ha.hystrix.command;

import cn.hutool.http.HttpUtil;
import com.lxm.eshop.cache.ha.dto.ProductInfo;
import com.lxm.eshop.cache.ha.util.JSONUtil;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;


/**
 *
 **/
public class GetProductInfoCommand extends HystrixCommand<ProductInfo> {
    private Long productId;

    public GetProductInfoCommand(Long productId) {
        super(HystrixCommandGroupKey.Factory.asKey("GetProductInfoCommandGroup"));
        this.productId = productId;
    }

    @Override
    protected ProductInfo run() throws Exception {
        String url = "http://127.0.0.1:8082/getProductInfo?productId=" + productId;
        String result = HttpUtil.get(url);
        return JSONUtil.jsonToPojo(result, ProductInfo.class);
    }
}
