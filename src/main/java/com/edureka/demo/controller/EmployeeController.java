package com.edureka.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"Rahul","Verma","rahul.verma@gmail.com"));
		employeesList.add(new Employee(2,"Jon","Snow","jon.show@gmail.com"));
		employeesList.add(new Employee(3,"Sheldon","Cooper","iwonthenobel@gmail.com"));
		employeesList.add(new Employee(4,"Walter","White","teacherturneddrugmafia@gmail.com"));
		employeesList.add(new Employee(5,"Tony","Stark","iamrich@gmail.com"));
		return employeesList;
    }

}
