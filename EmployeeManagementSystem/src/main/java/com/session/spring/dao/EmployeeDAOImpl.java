package com.session.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.session.spring.model.Employee;

@Repository
@EnableTransactionManagement
public class EmployeeDAOImpl implements EmployeeDAO{

	private SessionFactory sessionFactory;
	private Session session;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	@Override
	public void addEmployee(Employee E) {
		session=sessionFactory.getCurrentSession();
		session.persist(E);
		System.out.println(" Added Successfully");		
	}

	@Override
	public void updateEmployee(Employee E) {
		session=sessionFactory.getCurrentSession();
		session.update(E);
		System.out.println(" Updated Successfully");
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> EmployeeList() {
		session=sessionFactory.getCurrentSession();
		List<Employee>emplist=session.createQuery("from Employee").list();
		for(Employee e:emplist) {
			System.out.println("List :"+e);
		}
		return emplist;
	}

	@Override
	public Employee getemployeeById(int id) {
		session=sessionFactory.getCurrentSession();
		Employee employee=(Employee) session.get(Employee.class,id);
		System.out.println("Employee with the given id id:"+ employee	);
		return employee;
	}

	@Override
	public void removeEmployee(int id) {
		session=sessionFactory.getCurrentSession();
		Employee employee=(Employee)session.get(Employee.class, id);
		if(employee!=null) {
			session.delete(employee);
		}
		System.out.println("Deleted Employee is: "+employee);
	}

}
