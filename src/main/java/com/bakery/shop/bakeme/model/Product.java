package com.bakery.shop.bakeme.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "prod_name")
    private String prodName;

    @Column(name = "prod_price")
    private Float prodPrice;

    @Column(name = "prod_img")
    private String prodImg;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Float getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Float prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdImg() {
        return prodImg;
    }

    public void setProdImg(String prodImg) {
        this.prodImg = prodImg;
    }
}
