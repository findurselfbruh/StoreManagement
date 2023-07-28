package com.example.aks.Controller;

import com.example.aks.Dto.SearchRequest;
import com.example.aks.Entity.Customer;
import com.example.aks.Entity.CustomerOrder;
import com.example.aks.Service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aks/order")
public class OrderController {
    @Autowired
    private CustomerOrderService customerOrderService;
    @PostMapping("/save")

    public ResponseEntity<CustomerOrder> saveOrder(@RequestBody CustomerOrder customerOrder){

        return  new ResponseEntity<>(customerOrderService.saveOrder(customerOrder), HttpStatus.CREATED);
    }

//    @DeleteMapping("/delete/{id}")
//
//    public ResponseEntity<String> deleteCustomerOrder(@PathVariable("id") Long customerOrderId) {
//        customerOrderService.deleteCustomerOrder(customerOrderId);
//        return ResponseEntity.ok("CustomerOrder with ID " + customerOrderId + " has been deleted.");
//    }
//
//    @PutMapping("/put/{CustomerOrderId}")
//    public ResponseEntity<CustomerOrder> updateCustomerOrder(@PathVariable Long customerOrderId, @RequestBody CustomerOrder updatedCustomerOrder) {
//        CustomerOrder updatedCustomerOrders = CustomerOrderService.updateCustomerOrder(customerOrderId, updatedCustomerOrder);
//        return ResponseEntity.ok(updatedCustomerOrder);
//    }
//
//    @PostMapping("/search")
//    public ResponseEntity<List<CustomerOrder>> searchCustomerOrder(@RequestBody SearchRequest searchRequest) {
//
//        List<CustomerOrder> searchResults = CustomerOrderService.searchCustomerOrder(searchRequest.getSearchTerm());
//
//        if (!searchResults.isEmpty()) {
//            return ResponseEntity.ok(searchResults);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

}
