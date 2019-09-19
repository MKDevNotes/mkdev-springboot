package org.mkdev.swagger.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest/employee")
@Api(value = "Employee Servuce")
public class EmployeeService {
	
	@GetMapping
	public String sayHello() {
		return "Hello Swagger";
	}

	@ApiOperation(value = "Returns Employee Detail")
	@PostMapping("/getEmployee")
	public String getEmployee(@RequestBody final String employeName) {
		return employeName;
	}

	@ApiOperation(value = "Returns Hello World")
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody final String hello) {
		return hello;
	}
	
}
