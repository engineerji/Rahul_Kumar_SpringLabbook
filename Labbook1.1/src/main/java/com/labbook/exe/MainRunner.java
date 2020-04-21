package com.labbook.exe;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.labbook.config.JavaConfig;
import com.labbook.entities.Employee;

public class MainRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
		context.refresh();
		Employee employee = context.getBean(Employee.class);
		System.out.println("Employee Details");
		System.out.println("--------------------------------");
		System.out.println("Employee Id : "+employee.getEmpId());
		System.out.println("Employee Name : "+employee.getEmpName());
		System.out.println("Employee Salary : "+employee.getSalary());
		System.out.println("Employee BU : "+employee.getBu());
		System.out.println("Employee Age : "+employee.getEmpAge());
	}
}
