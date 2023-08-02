package com.example.aks.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Shop")

public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shopId;
    @Column(name = "shop_name")
    private String shopName;
    @Column(name = "product_id")
    private long productId;
    @Column(name = "product_qty")
    private long productQty;
}
