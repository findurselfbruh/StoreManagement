package com.example.aks.Repository;

import com.example.aks.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductNameLikeIgnoreCaseOrProductQtyOrProductPriceOrShopId(String searchByName,
                                                                                   long searchByOrderProductQty,
                                                                                   long searchByTotalPrice,
                                                                                   long searchByShopId);

}
