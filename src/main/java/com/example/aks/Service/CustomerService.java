package com.example.aks.Service;

import com.example.aks.Entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    void deleteCustomer(long customerId);

    Customer updateCustomer(Long customerId, Customer updatedCustomer);


    List<Customer> searchCustomers( String searchByName,
                                    String searchByGmail);



}
