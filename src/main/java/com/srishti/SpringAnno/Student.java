package com.srishti.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Autowired
	@Qualifier("principal")
	Community c;
	
	public Community getC() {
		return c;
	}

	public void setC(Community c) {
		this.c = c;
	}

	public void studentInfo() {
		System.out.println("Srishti Dixit");
		c.getAge();
	}
}
