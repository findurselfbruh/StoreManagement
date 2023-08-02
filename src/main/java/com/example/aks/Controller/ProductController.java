package com.example.aks.Controller;

import com.example.aks.Dto.SearchRequest;
import com.example.aks.Entity.Product;
import com.example.aks.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aks/product")
public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {

        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.ok("product with ID " + productId + " has been deleted.");
    }

    @PutMapping("/put/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody Product updatedProduct) {
        Product updatedProducts = productService.updateProduct(productId, updatedProduct);
        return ResponseEntity.ok( updatedProduct);
    }

    @PostMapping("/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestBody SearchRequest searchRequest) {

        List<Product> searchResults = productService.searchProduct(
                  "%" + searchRequest.getSearchByName() + "%",
                searchRequest.getSearchByQty(),
                searchRequest.getSearchByTotalPrice(),
                searchRequest.getSearchByShopId());
        if (!searchResults.isEmpty()) {
            return ResponseEntity.ok(searchResults);

        } else {
            return ResponseEntity.notFound().build();
        }

    }


}
