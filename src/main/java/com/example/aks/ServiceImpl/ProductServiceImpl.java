package com.example.aks.ServiceImpl;

import com.example.aks.Entity.Product;
import com.example.aks.Repository.ProductRepository;
import com.example.aks.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product updateProduct(Long productId, Product updatedProduct) {
        Product existingProduct = productRepository.findById(productId)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + productId));

        existingProduct.setProductName(updatedProduct.getProductName());
        existingProduct.setProductQty(updatedProduct.getProductQty());
        existingProduct.setProductPrice(updatedProduct.getProductPrice());
        existingProduct.setShopId(updatedProduct.getShopId());

        return productRepository.save(existingProduct);
    }

    @Override
    public List<Product> searchProduct(String searchByName,
                                       long searchByOrderProductQty,
                                       long searchByTotalPrice,
                                       long searchByShopId) {
        return productRepository.findByProductNameLikeIgnoreCaseOrProductQtyOrProductPriceOrShopId(
                searchByName,
                searchByOrderProductQty,
                searchByTotalPrice,
                searchByShopId);
    }




}

