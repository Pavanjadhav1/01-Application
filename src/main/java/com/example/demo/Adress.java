package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Adress {
	
      @Value("h-124")
	 String hNo;
      
	 @Value("Banawadi colony")
	 String loc;
	 
	 public String toString()
	 {
		String str="hno = "+hNo+" Location= "+loc;
		
		return str;
		
		
	 }
}
