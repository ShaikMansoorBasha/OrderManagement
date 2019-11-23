package com.example.dao;

import org.springframework.data.repository.CrudRepository;


import com.example.entity.Orderentity;

public interface Orderdao  extends CrudRepository<Orderentity,Long> {
	

	Orderentity findByNum(int num); 
	

}
