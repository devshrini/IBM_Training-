package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = "com.example") // "Look in this folder for @Components"
public class App {
    public static void main(String[] args) {
        
        // 1. Start Spring. It finds DebitCard and OrderService, and links them.
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Ask Spring for the finished OrderService
        OrderService order = context.getBean(OrderService.class);

        // 3. Test it!
        order.placeOrder();
    }
}