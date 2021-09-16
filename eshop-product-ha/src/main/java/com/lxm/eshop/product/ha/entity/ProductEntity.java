package com.lxm.eshop.product.ha.entity;

import java.io.Serializable;


/**
 * 商品实体类
 **/
public class ProductEntity implements Serializable {
    private Long productId;
    private String name = "iphone13";
    private Long price = 9999L;

    public ProductEntity() {}
    public ProductEntity(Long productId) {
        this.productId = productId;
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
