package com.session.spring.dao;

import java.util.List;

import com.session.spring.model.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee E);
	public void updateEmployee(Employee E);
	public List<Employee> EmployeeList();
	public Employee getemployeeById(int id);
	public void removeEmployee(int id);
}
