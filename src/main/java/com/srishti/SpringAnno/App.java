package com.srishti.SpringAnno;

//No XML involved
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//Spring Core Annotations
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	Student obj = factory.getBean(Student.class);
    	obj.studentInfo();
    	
    	
//    	//Not good so use application context
//        Student s = new Student();
//        s.studentInfo();
    }
}
