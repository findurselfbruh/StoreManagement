package com.example.aks.ServiceImpl;

import com.example.aks.Entity.Customer;
import com.example.aks.Repository.CustomerRepository;
import com.example.aks.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(long customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customer updateCustomer(Long customerId, Customer updatedCustomer) {
        Customer existingCustomer = customerRepository.findById(customerId)
                .orElseThrow(() -> new EntityNotFoundException("Customer not found with id: " + customerId));

        existingCustomer.setCustomerName(updatedCustomer.getCustomerName());
        existingCustomer.setCustomerGmail(updatedCustomer.getCustomerGmail());

        return customerRepository.save(existingCustomer);
        }



    @Override
    public List<Customer> searchCustomers(String name,
                                          String gmail) {
        return customerRepository.findByCustomerNameLikeIgnoreCaseOrCustomerGmailLikeIgnoreCase(name,gmail);
    }



}
