package com.example.aks.ServiceImpl;

import com.example.aks.Entity.Payment;
import com.example.aks.Repository.PaymentRepository;
import com.example.aks.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PaymentImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
