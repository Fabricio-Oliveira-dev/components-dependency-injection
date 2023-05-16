package com.devfabricio.orderexercise.service;

import org.springframework.stereotype.Service;

import com.devfabricio.orderexercise.entity.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		
		double valueWithDiscount = order.getBasic() - order.getDiscount();
		
		if (valueWithDiscount < 100.00) {
			valueWithDiscount = 20.00;
		}
		else if (valueWithDiscount >= 100.00 && valueWithDiscount < 200) {
			valueWithDiscount = 12.00;
		}
		else {
			valueWithDiscount = 0.00;
		}
		return valueWithDiscount;
	}
}