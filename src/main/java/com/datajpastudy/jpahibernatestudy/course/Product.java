package com.datajpastudy.jpahibernatestudy.course;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;
    private int pid;
    private String productName;
    private int quantidade;
    private int price;


    public Product(int id, int pid, String productName, int quantidade, int price) {
        this.id = id;
        this.pid = pid;
        this.productName = productName;
        this.quantidade = quantidade;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pid=" + pid +
                ", productName='" + productName + '\'' +
                ", quantidade=" + quantidade +
                ", price=" + price +
                '}';
    }
}
