package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Orderdao;
import com.example.entity.Orderentity;

@Service
public class OrderService {
	@Autowired
	Orderdao orderdao;

	public Orderentity saveDetails(Orderentity orderentity) {
	
		return orderdao.save(orderentity);
	}

	public Orderentity getdetails(int num) {
	
		return orderdao.findByNum(num);
	}

	
	
	

}
