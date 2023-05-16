package com.devfabricio.orderexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devfabricio.orderexercise.entity.Order;
import com.devfabricio.orderexercise.service.OrderService;

@SpringBootApplication
@ComponentScan({"com.devfabricio"})
public class OrderexerciseApplication implements CommandLineRunner{
	
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderexerciseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 0.80);
		System.out.println("Pedido código " + order.getCode() + "\nValor total: R$ " + orderService.total(order));
		
		Order order2 = new Order(2282, 800.00, 0.90);
		System.out.println("Pedido código " + order2.getCode() + "\nValor total: R$ " + orderService.total(order2));
		
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order3.getCode() + "\nValor total: R$ " + orderService.total(order3));
	}
}