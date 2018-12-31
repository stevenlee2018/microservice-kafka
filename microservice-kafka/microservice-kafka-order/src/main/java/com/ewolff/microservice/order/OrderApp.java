package com.ewolff.microservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApp {

	public static void main(String[] args) {
		System.out.println("ZBLI: enter OrderApp::main()");	
		SpringApplication.run(OrderApp.class, args);
		System.out.println("ZBLI: exit OrderApp::main()");	
	}

}
