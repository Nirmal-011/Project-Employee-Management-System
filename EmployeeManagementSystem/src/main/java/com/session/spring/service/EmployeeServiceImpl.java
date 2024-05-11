package com.session.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.session.spring.dao.EmployeeDAO;
import com.session.spring.model.Employee;

@Service	
public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeDAO ED;
	
	@Autowired
	@Qualifier("employeeDAOImpl")
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.ED = employeeDAO;
	}
	
	@Override
	@Transactional
	public void addEmployee(Employee E) {
		this.ED.addEmployee(E);
		
	}

	@Override
	@Transactional
	public void updateEmployee(Employee E) {
		this.ED.updateEmployee(E);
		
	}

	@Override
	@Transactional
	public List<Employee> EmployeeList() {
		List<Employee> elist=this.ED.EmployeeList();
		return elist;
	}

	@Override
	@Transactional
	public Employee getemployeeById(int id) {
		Employee employee=this.ED.getemployeeById(id);
		return employee;
	}

	@Override
	@Transactional
	public void removeEmployee(int id) {
		this.ED.removeEmployee(id);
		
	}

}
