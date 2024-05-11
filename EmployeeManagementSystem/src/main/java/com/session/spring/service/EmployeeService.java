package com.session.spring.service;

import java.util.List;

import com.session.spring.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee E);
	public void updateEmployee(Employee E);
	public List<Employee> EmployeeList();
	public Employee getemployeeById(int id);
	public void removeEmployee(int id);
}
