package com.example.OrdeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = 
{"com.example.controller","com.example.dao","com.example.entity","com.example.service"})
@EnableJpaRepositories("com.example.dao")
@EntityScan(basePackages = "com.example.entity")

public class OrdeManagementApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OrdeManagementApplication.class, args);
	}

}
