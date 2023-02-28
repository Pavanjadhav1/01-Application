package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@RestController
@SpringBootApplication
public class SpringbootSession7Application {

	public static void main(String[] args) {
	
		
		ApplicationContext ap=SpringApplication.run(SpringbootSession7Application.class, args);
	
	Product p=ap.getBean("pob",Product.class);
	
	p.display();
//	
	Employee e=ap.getBean("eob",Employee.class);
	
	System.out.println(e);
	
	}

}
