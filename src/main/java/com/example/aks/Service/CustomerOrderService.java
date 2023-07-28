package com.example.aks.Service;

import com.example.aks.Entity.Customer;
import com.example.aks.Entity.CustomerOrder;

import java.util.List;

public interface CustomerOrderService {
    CustomerOrder saveOrder(CustomerOrder customerOrder);

//    void deleteCustomerOrder(long customerOrderId);
//
//    CustomerOrder updateCustomerOrder(Long customerOrderId, CustomerOrder updatedCustomerOrder);
//
//    List<CustomerOrder> searchCustomerOrder(String searchTerm);
}
