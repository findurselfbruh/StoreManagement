package com.example.aks.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @Column(name = "Employee_Name")
    private String employeeName;

    @Column(name = "Employee_Gmail")
    private String employeeGmail;
}
