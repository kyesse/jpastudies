package com.datajpastudy.jpahibernatestudy.dto;

public class OrderResponse {
    private String name;
    private String productName;

    public OrderResponse(String name, String productName) {
        this.name = name;
        this.productName = productName;
    }

    public OrderResponse() {
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "name='" + name + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
