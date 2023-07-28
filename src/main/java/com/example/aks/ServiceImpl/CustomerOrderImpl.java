package com.example.aks.ServiceImpl;

import com.example.aks.Entity.Customer;
import com.example.aks.Entity.CustomerOrder;
import com.example.aks.Repository.CustomerOrderRepository;
import com.example.aks.Service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service

public class CustomerOrderImpl implements CustomerOrderService {
    @Autowired
    private CustomerOrderRepository customerOrderRepository;
    @Override
    public CustomerOrder saveOrder(CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }


//    @Override
//    public void deleteCustomerOrder(long customerOrderId) {
//        customerOrderRepository.deleteById(customerOrderId);
//    }

//    @Override
//    public CustomerOrder updateCustomerOrder(Long CustomerOrderId, Customer updatedCustomer) {
//        Customer existingCustomer = customerRepository.findById(customerId)
//                .orElseThrow(() -> new EntityNotFoundException("Customer not found with id: " + customerId));
//
//        existingCustomer.setCustomerName(updatedCustomer.getCustomerName());
//        existingCustomer.setCustomerGmail(updatedCustomer.getCustomerGmail());
//
//        // Perform other updates as needed
//
//        return customerRepository.save(existingCustomer);
//    };
//
//
//public List<Customer> searchCustomers(String searchTerm) {
//
//
//        return customerRepository.findByCustomerNameContainingIgnoreCase(searchTerm);
     }

