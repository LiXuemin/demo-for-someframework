package com.lxm.eshop.cache.ha.hystrix.command;

import cn.hutool.http.HttpUtil;
import com.lxm.eshop.cache.ha.dto.ProductInfo;
import com.lxm.eshop.cache.ha.util.JSONUtil;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixObservableCommand;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.Schedulers;


/**
 *
 **/
public class GetProductInfoObservableCommand extends HystrixObservableCommand<ProductInfo> {
    private Long[] productIds;

    public GetProductInfoObservableCommand(Long[] productIds) {
        super(HystrixCommandGroupKey.Factory.asKey("GetProductInfoObservableGroup"));
        this.productIds = productIds;
    }

    @Override
    protected Observable<ProductInfo> construct() {

        return Observable.create(new Observable.OnSubscribe<ProductInfo>() {
            @Override
            public void call(Subscriber<? super ProductInfo> observer) {
                try {
                    if (observer.isUnsubscribed()) {
                        for (Long productId : productIds){
                            String url = "http://127.0.0.1:8082/getProductInfo?productId=" + productId;
                            String result = HttpUtil.get(url);
                            ProductInfo productInfo = JSONUtil.jsonToPojo(result, ProductInfo.class);
                            observer.onNext(productInfo);
                        }
                        observer.onCompleted();
                    }
                } catch (Exception e) {
                    observer.onError(e);
                }
            }
        }).subscribeOn(Schedulers.io());
    }
}
