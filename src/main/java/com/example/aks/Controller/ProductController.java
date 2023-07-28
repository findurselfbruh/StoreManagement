package com.example.aks.Controller;

import com.example.aks.Entity.Product;
import com.example.aks.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aks/product")
public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping("/ak")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {

        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

}
