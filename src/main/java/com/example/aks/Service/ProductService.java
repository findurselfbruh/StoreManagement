package com.example.aks.Service;

import com.example.aks.Entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    void deleteProduct(long productId);
    Product updateProduct(Long productId, Product updatedProduct);

    List<Product> searchProduct(String searchByName,
                                long searchByOrderProductQty,
                                long searchByTotalPrice,
                                long searchByShopId);


}
