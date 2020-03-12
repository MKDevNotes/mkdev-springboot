package com.dn.jpa.curd.controller;

import java.util.List;

import javax.validation.Valid;

import com.dn.jpa.curd.bean.Employee;
import com.dn.jpa.curd.exception.RecordNotFoundException;
import com.dn.jpa.curd.repository.EmployeeRepository;
import com.dn.jpa.curd.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController{

    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
	public String welcome() {
		return "login";
	}

	@RequestMapping("/viewEmployee")
	public String viewEmployeeList(Model model) {
				model.addAttribute("employeeList", employeeService.getAllEmployees());
		return "viewEmployeeList";
    }
 
    @GetMapping("/addEmployee")
	public String addNewEmployee(Employee employee) {
		return "addEmployee";
    }

    @PostMapping("add")
	public String addEmployee(@Valid Employee employee, BindingResult result, Model model) throws RecordNotFoundException {

		employeeService.createOrUpdateEmployee(employee);
        
		return "redirect:/viewEmployee";
    }
    
    @GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) throws RecordNotFoundException {
		model.addAttribute("employee", employeeService.getEmployeeId(id));
		return "editEmployee";
    }
    

    @PostMapping("update/{id}")
	public String updateEmployee(@PathVariable("id") long id, @Valid Employee employee, BindingResult result,
			Model model) throws RecordNotFoundException {
		if (result.hasErrors()) {
			employee.setEmployeeId(id);
			return "editEmployee";
		} 
        
        employeeService.createOrUpdateEmployee(employee);
        
		return "redirect:/viewEmployee";
    }

    @GetMapping("delete/{id}")
	public String deleteEmployee(@PathVariable("id") long id, Model model) throws RecordNotFoundException {
        
        employeeService.deleteEmployeeById(id);
        
		return "redirect:/viewEmployee";
	}
    
    

}