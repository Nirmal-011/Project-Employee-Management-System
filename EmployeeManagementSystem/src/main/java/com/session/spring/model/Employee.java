package com.session.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="emp_name")
	private String eName;
	
	@Column(name="emp_add")
	private String eAdd;
	
	@Column(name="emp_phn")
	private int ePhn;
	
	@Column(name="emp_salary")
	private double esalary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAdd() {
		return eAdd;
	}

	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}

	public int getePhn() {
		return ePhn;
	}

	public void setePhn(int ePhn) {
		this.ePhn = ePhn;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "id"+id+"Eployee Name"+ eName+"Employee Address"+eAdd+"Employee Phone"+ePhn+"Employee Salary"+esalary;
	}
	
	

}
