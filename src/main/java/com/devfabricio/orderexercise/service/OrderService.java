package com.devfabricio.orderexercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfabricio.orderexercise.entity.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public Double total(Order order) {
		double valueWithDiscount = order.getBasic() * order.getDiscount();
		
		return valueWithDiscount > 0.00 ? valueWithDiscount + shippingService.shipment(order)
										: order.getBasic() + shippingService.shipment(order);
	}
}