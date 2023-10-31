package com.srishti.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//This class is responsible to provide objs of classes based on annotation.
@Configuration
//Can specify multiple packages using ,
@ComponentScan(basePackages = "com.srishti.SpringAnno")
public class AppConfig 
{
	
	
//	We can avoid below by mentioning component scan and component annotation.
//  Class is blank	
	
//	@Bean
//	public Student getInfo() {
//		return new Student();
//	}
//	
//	@Bean
//	public Community getMthd() {
//		return new Teacher();
//	}
	
	
	
}
