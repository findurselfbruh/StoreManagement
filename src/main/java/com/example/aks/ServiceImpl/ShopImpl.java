package com.example.aks.ServiceImpl;

import com.example.aks.Entity.Shop;
import com.example.aks.Repository.EmployeeRepository;
import com.example.aks.Repository.ShopRepository;
import com.example.aks.Service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopImpl implements ShopService {
    @Autowired
    private ShopRepository shopRepository;
    @Override
    public Shop saveShop(Shop shop) {
        return shopRepository.save(shop);
    }
}
