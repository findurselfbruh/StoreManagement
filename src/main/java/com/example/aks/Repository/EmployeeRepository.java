package com.example.aks.Repository;

import com.example.aks.Entity.Customer;
import com.example.aks.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByEmployeeNameLikeIgnoreCaseOrEmployeeGmailLikeIgnoreCase
            ( String searchByName,
              String searchByGmail);

}
