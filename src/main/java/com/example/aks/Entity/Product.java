package com.example.aks.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    @Column(name = "product_Name")
    private String productName;
    @Column(name = "productQty")
    private long productQty;
    @Column(name = "Product_price")
    private long productPrice;
    @Column(name = "shop_id")
    private long shopId;

}
