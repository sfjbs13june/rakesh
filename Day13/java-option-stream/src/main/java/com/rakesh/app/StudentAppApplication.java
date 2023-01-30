package com.rakesh.app;

import com.rakesh.app.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		StudentController studentController=new StudentController();

		studentController.getStudents("rakesh").ifPresent(student -> System.out.println(student.getAllDetails()));

		StreamApp streamApp=new StreamApp();
		System.out.println("employee Array");
		streamApp.getEmployeeArray().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee List");
		streamApp.getEmployeeList().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee Data");
		streamApp.getEmployeeData().forEach(employee -> System.out.println(employee.toString()));
		System.out.println("employee builder");
		streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));
		streamApp.getEmployeeList().forEach(e -> e.salaryIncrement(10.0));
		streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));
	}

}
