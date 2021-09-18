package com.lxm.eshop.cache.ha.controller;

import cn.hutool.http.HttpUtil;
import com.lxm.eshop.cache.ha.dto.ProductInfo;
import com.lxm.eshop.cache.ha.hystrix.command.GetProductInfoCommand;
import com.lxm.eshop.cache.ha.hystrix.command.GetProductInfoObservableCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Observable;
import rx.Observer;


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

    @RequestMapping("/getProductInfo")
    public String getProductInfo(Long productId) {
        GetProductInfoCommand getProductInfoCommand = new GetProductInfoCommand(productId);
        ProductInfo productInfo = getProductInfoCommand.execute();
        System.out.println(productInfo);
        return "success";
    }

    @RequestMapping("/getProductInfos")
    public String getProductInfos(Long... productIds) {
        GetProductInfoObservableCommand observableCommand = new GetProductInfoObservableCommand(productIds);
        Observable<ProductInfo> productInfoObservable = observableCommand.observe();
        productInfoObservable.subscribe(new Observer<ProductInfo>() {
            @Override
            public void onCompleted() {
                System.out.println("接收完毕所有数据");
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onNext(ProductInfo productInfo) {
                System.out.println(productInfo.toString());
            }
        });
        return "success";
    }
}
