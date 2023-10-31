package com.srishti.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //this will be picked instead of teacher when interface is called in Student class as its primary.
//Or
//Can specify in Student class for Community interface under @Qualifier("Principal")
//That will pick principal instead of Teacher
public class Principal implements Community {

	@Override
	public void getAge() {
		System.out.println("P1 age: 70");

	}

}
