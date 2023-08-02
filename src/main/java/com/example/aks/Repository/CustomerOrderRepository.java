package com.example.aks.Repository;

import com.example.aks.Entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Long> {

    List<CustomerOrder> findByProductIdOrCustomerIdOrOrderProductQtyOrTotalPrice( long searchByProductId ,
                                                                                  long searchByCustomerId ,
                                                                                  long  searchByQty,
                                                                                  long  searchByTotalPrice);
}


