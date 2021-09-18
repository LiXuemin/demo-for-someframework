package com.lxm.eshop.cache.ha.dto;

/**
 *
 **/
public class ProductInfo {
    private Long productId;
    private String name;
    private Long price;

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

    @Override
    public String toString() {
        return "ProductInfo{" + "productId=" + productId + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}
