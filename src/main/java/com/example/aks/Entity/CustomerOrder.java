package com.example.aks.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CustomerOrder")

public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    @Column(name = "product_id")
    private long productId;
    @Column(name = "customer_id")
    private long customerId;
    @Column(name = "order_product_qty")
    private long orderProductQty;
    @Column(name = "total_price")
    private long totalPrice;
}
