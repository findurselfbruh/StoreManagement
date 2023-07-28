package com.example.aks.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    @Column(name = "Customer_Name")
    private String customerName;
    @Column(name = "Customer_Gmail")
    private String customerGmail;


}
