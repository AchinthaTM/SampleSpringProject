package com.achintha.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achintha.springbootrestapiexample.model.Employee;
import com.achintha.springbootrestapiexample.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/* SAVE AN EMPLOYEE */
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	/* SEARCH ALL EMPLOYEES */
	public List<Employee> findAll(){
	return employeeRepository.findAll();
	}
	
	/* GET AN EMPLOYEE */
	public Employee findOne(Long empId) {
	return employeeRepository.findOne(empId);
	}
	
	/* DELETE AN EMPLOYEE by id */
	public void delete(Employee emp) {
	employeeRepository.delete(emp);
	}

}
