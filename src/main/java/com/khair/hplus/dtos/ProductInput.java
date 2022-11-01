package com.khair.hplus.dtos;

import com.khair.hplus.domain.Product;

public class ProductInput {

    private String name;
    private int size;
    private String variety;
    private float price;
    private String status;

    private String productId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Product getProductEntity(){
        Product product = new Product();

        product.setProductId(this.productId);
        product.setName(this.name);
        product.setPrice(this.price);
        product.setSize(this.size);
        product.setVariety(this.variety);
        product.setStatus(this.status);

        return product;
    }
}
