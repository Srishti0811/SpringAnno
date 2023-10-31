package com.srishti.SpringAnno;

import org.springframework.stereotype.Component;

//default name will be de capatalized teacher. 
//We can mention some other name @Component("myTeacher") if we want to change it.
@Component
public class Teacher implements Community {

	@Override
	public void getAge() {
		System.out.println("T1 Age: 24");
		
	}
	
	

}
