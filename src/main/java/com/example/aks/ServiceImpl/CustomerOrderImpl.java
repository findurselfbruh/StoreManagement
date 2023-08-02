package com.example.aks.ServiceImpl;

import com.example.aks.Entity.CustomerOrder;
import com.example.aks.Repository.CustomerOrderRepository;
import com.example.aks.Service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service

public class CustomerOrderImpl implements CustomerOrderService {
    @Autowired
    private CustomerOrderRepository customerOrderRepository;

    @Override
    public CustomerOrder saveOrder(CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }


    @Override
    public void deleteCustomerOrder(long customerOrderId) {
        customerOrderRepository.deleteById(customerOrderId);
    }





        @Override
        public CustomerOrder updateCustomerOrder(Long orderId, CustomerOrder updatedCustomerOrder) {
            CustomerOrder existingOrder = customerOrderRepository.findById(orderId)
                    .orElseThrow(() -> new EntityNotFoundException("Order with ID " + orderId + " not found."));

            // Update the properties of the existing order with the values from the updated order
            existingOrder.setProductId(updatedCustomerOrder.getProductId());
            existingOrder.setCustomerId(updatedCustomerOrder.getCustomerId());
            existingOrder.setOrderProductQty(updatedCustomerOrder.getOrderProductQty());
            existingOrder.setTotalPrice(updatedCustomerOrder.getTotalPrice());

            return customerOrderRepository.save(existingOrder);
        }

    @Override
    public List<CustomerOrder> searchCustomerOrder(long searchByProductId, long searchByCustomerId, long searchByQty, long searchByTotalPrice) {
        return customerOrderRepository.findByProductIdOrCustomerIdOrOrderProductQtyOrTotalPrice(
                searchByProductId,
                searchByCustomerId,
                searchByQty,
                searchByTotalPrice);
    }


}


