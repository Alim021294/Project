package com.springdemo2.services;

import java.util.List;
import java.util.Optional;

import com.springdemo2.model.Employee;


public interface Myservice {

	public List<Employee> getEmployees();
	public Optional<Employee> getEmployeeById(int empid);
	public Employee addNewEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public void deleteEmployeeById(int empid);
	public void deleteAllEmployees();
	
}
