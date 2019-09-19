package org.mkdev.swagger.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author muthukumar thangavinayagam
 *
 */

@RestController
@RequestMapping("/rest/department")
@Api(value = "Department Servuce")
public class DepartmentService {
	
	@GetMapping
	public String getDepartmentName() {
		return "Department SpringBoot";
	}

	@ApiOperation(value = "Returns Department Detail")
	@PostMapping("/getEmployee")
	public String getEmployee(@RequestBody final String departmentName) {
		return "This is Department Name : "+departmentName;
	}

	@ApiOperation(value = "Returns Department Detail")
	@PutMapping("/updateDepartment")
	public String updateDepartment(@RequestBody final String department) {
		return department;
	}
	
}
