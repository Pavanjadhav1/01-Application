package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
public class Employee {
	
	@Value("20")
	int eid;
	@Value("Pavan")
	String ename;
	
	@Autowired
	Adress addr;
	
	public String toString()
	{
		String str="eid = "+eid+" ename= "+ename+" Adress = "+addr;
		
		return str;
	}
	

}
