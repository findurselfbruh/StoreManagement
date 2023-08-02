package com.example.aks.Service;

import com.example.aks.Entity.CustomerOrder;

import java.util.List;

public interface CustomerOrderService {
    CustomerOrder saveOrder(CustomerOrder customerOrder);

    void deleteCustomerOrder(long customerOrderId);


    CustomerOrder updateCustomerOrder(Long orderId, CustomerOrder updatedCustomerOrder);

    List<CustomerOrder> searchCustomerOrder( long searchByProductId ,
                                             long searchByCustomerId ,
                                             long  searchByQty,
                                             long  searchByTotalPrice);


}