package com.krithi.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public String getEmployeeDetails() {
		return "Employee details fetched successfully";
	}

}
