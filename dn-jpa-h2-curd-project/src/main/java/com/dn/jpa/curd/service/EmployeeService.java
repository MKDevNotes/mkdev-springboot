package com.dn.jpa.curd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dn.jpa.curd.bean.Employee;
import com.dn.jpa.curd.exception.RecordNotFoundException;
import com.dn.jpa.curd.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		
		System.out.println("Employee List :: ");
		
		List<Employee> employeeList = employeeRepository.findAll();

		System.out.println("Employee List :"+employeeList.size());
		if (!employeeList.isEmpty()) {
			return employeeList;
		} else {
			return new ArrayList<Employee>();
		}
	}

	public Employee getEmployeeId(Long Id) throws RecordNotFoundException {
		Optional<Employee> employee = employeeRepository.findById(Id);

		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	public Employee createOrUpdateEmployee(Employee employee) throws RecordNotFoundException {
		Optional<Employee> employeeObj = employeeRepository.findById(employee.getEmployeeId());

		if (employeeObj.isPresent()) {
			Employee newEmployee = employeeObj.get();

			newEmployee.setFirstName(employee.getFirstName());
			newEmployee.setLastName(employee.getLastName());
			newEmployee.setJobTitle(employee.getJobTitle());
			newEmployee.setSalary(employee.getSalary());

			newEmployee = employeeRepository.save(employee);

			return newEmployee;
		} else {
			employee = employeeRepository.save(employee);

			return employee;
		}
	}

	public void deleteEmployeeById(Long id) throws RecordNotFoundException {
		Optional<Employee> employee = employeeRepository.findById(id);

		if (employee.isPresent()) {
			employeeRepository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

}
