package com.dn.jpa.curd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dn.jpa.curd.bean.Employee;
import com.dn.jpa.curd.exception.RecordNotFoundException;
import com.dn.jpa.curd.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/viewEmployeeList")
	public String viewEmployeeList(Model model) {
		List<Employee> employeeList = employeeService.getAllEmployees();
		model.addAttribute("employeeList", employeeList);
		return "employeeList";
	}

	/*
	 * @RequestMapping("/edit/{id}") public ModelAndView
	 * showEditProductPage(@PathVariable(name = "id") int id) { ModelAndView mav =
	 * new ModelAndView("edit_product"); Employee employee = service.get(id);
	 * mav.addObject("product", product);
	 * 
	 * return mav; }
	 */
	@RequestMapping(value = "/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) throws RecordNotFoundException {
		model.addAttribute("command", employeeService.getEmployeeId(id));
		return "editEmployee";
	}
}
