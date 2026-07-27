package com.example;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component 
public class OrderService {
    
    private final PaymentService paymentService;

    // Spring sees @Autowired and hands this class the DebitCard automatically.
    @Autowired 
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        System.out.println("Order placed!");
        paymentService.pay(); // This will use the DebitCard
    }
}