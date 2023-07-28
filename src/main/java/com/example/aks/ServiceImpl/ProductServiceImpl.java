package com.example.aks.ServiceImpl;

import com.example.aks.Entity.Product;
import com.example.aks.Repository.ProductRepository;
import com.example.aks.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
