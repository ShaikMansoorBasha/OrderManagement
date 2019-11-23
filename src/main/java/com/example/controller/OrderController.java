package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Orderentity;
import com.example.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@CrossOrigin
	@PostMapping(path="/order")
	public  Orderentity saveDetails(  @RequestBody Orderentity orderentity) {
		System.out.println("String value is "+orderentity.getS1());
		System.out.println("integer value is "+orderentity.getNum());
		
		
		return orderService.saveDetails(orderentity) ;
		
	}
	
	@CrossOrigin
	@GetMapping(path="/getorder")
	public  Orderentity getdetails(  @RequestParam int Num) {
		System.out.println("String value is "+Num);
		return orderService.getdetails(Num) ;
		
	}
	
}
