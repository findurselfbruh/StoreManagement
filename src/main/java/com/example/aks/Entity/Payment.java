package com.example.aks.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentId;
    @Column(name = "payment_type")
    private String paymentType;
    @Column(name = "payment_time")
    private LocalDateTime paymentTime;
    @Column(name = "order_id")
    private long orderId;
}
