package com.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lab.Entity.Student;
import com.lab.Service.studentService;

@SpringBootApplication
public class studentCoaching {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(studentCoaching.class, args);
		
		studentService bean = context.getBean(studentService.class);
		Student student = new Student();
		student.setName("Adarsh");
		student.setSubject("Spring Boot");
		student.setFees(2500.00f);
		
	Student saveStudent = bean.saveStudent(student);
	
	System.out.println(saveStudent);
	}

}
