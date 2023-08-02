package com.example.aks.Controller;

import com.example.aks.Entity.Shop;
import com.example.aks.Service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aks/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;
    @PostMapping("/save")
    public ResponseEntity<Shop> saveShop(@RequestBody Shop shop){

        return  new ResponseEntity<>(shopService.saveShop(shop), HttpStatus.CREATED);
    }
}
