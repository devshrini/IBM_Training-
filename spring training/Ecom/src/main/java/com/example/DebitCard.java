package com.example;
import org.springframework.stereotype.Component;

@Component 
public class DebitCard implements PaymentService {
    
    @Override
    public void pay() {
        System.out.println("Paid using Debit Card.");
    }
}