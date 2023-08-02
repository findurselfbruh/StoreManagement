package com.example.aks.Controller;

import com.example.aks.Dto.SearchRequest;
import com.example.aks.Entity.Customer;
import com.example.aks.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aks/customer")
public class CustomerController {
    @Autowired
     CustomerService customerService;

    @PostMapping("/save")

    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {


        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")

    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId) {
        customerService.deleteCustomer(customerId);
        return ResponseEntity.ok("Customer with ID " + customerId + " has been deleted.");
    }

    @PutMapping("/put/{customerId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long customerId, @RequestBody Customer updatedCustomer) {
        Customer updatedCustomers = customerService.updateCustomer(customerId, updatedCustomer);
        return ResponseEntity.ok( updatedCustomers);
    }

    @PostMapping("/search")
    public ResponseEntity<List<Customer>> searchCustomers(@RequestBody  SearchRequest searchRequest) {

        List<Customer> searchResults = customerService.searchCustomers( "%" + searchRequest.getSearchByName() + "%",
                                                                        "%" + searchRequest.getSearchByGmail() + "%");
        if (!searchResults.isEmpty()) {
            return ResponseEntity.ok(searchResults);

        } else {
            return ResponseEntity.notFound().build();
        }

    }


}
