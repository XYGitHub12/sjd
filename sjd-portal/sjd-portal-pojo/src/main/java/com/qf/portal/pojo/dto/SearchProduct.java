package com.qf.portal.pojo.dto;

import com.qf.portal.pojo.po.TbProduct;

public class SearchProduct extends TbProduct {

    private Double minPrice;
    private Double maxPrice;

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
