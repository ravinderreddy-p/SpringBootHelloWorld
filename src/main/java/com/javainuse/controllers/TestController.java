package com.javainuse.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javainuse.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")

public class TestController {
	private List<Employee> employees = createList();
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	
	public List<Employee> firstPage() {
		return employees;
		
	}

	private List<Employee> createList() {
		List<Employee> tempEmployees = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setName("emp1");
		emp1.setDesignation("Manager");
		emp1.setEmpId("1");
		emp1.setSalary(300000);
		
		Employee emp2 = new Employee();
		emp2.setName("emp2");
		emp2.setDesignation("developer");
		emp2.setEmpId("2");
		emp2.setSalary(400000);
		
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		return tempEmployees;
	}
	

}
