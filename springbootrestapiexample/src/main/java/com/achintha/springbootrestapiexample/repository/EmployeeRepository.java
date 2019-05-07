package com.achintha.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.achintha.springbootrestapiexample.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{	
}