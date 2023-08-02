package com.example.aks.Repository;

import com.example.aks.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByCustomerNameLikeIgnoreCaseOrCustomerGmailLikeIgnoreCase
                       ( String searchByName,
                       String searchByGmail);

}
