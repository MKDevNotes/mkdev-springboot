package com.dn.jpa.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dn.jpa.curd.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
