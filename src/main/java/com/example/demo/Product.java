package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pob")
public class Product {

	@Value("007")
	private int pid;
	
	@Value("Pavan887")
	private String pCode;
	
	public void display()
	{
		System.out.println("pdi = "+pid+" pcode= "+pCode);
	}
	
}
