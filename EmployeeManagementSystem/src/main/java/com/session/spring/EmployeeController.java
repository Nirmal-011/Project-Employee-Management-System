package com.session.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.session.spring.model.Employee;
import com.session.spring.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	private EmployeeService ES;
		
	@Autowired(required=true)
	public void setEmployeeService(EmployeeService ES) {
		this.ES=ES;}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listEmployees(Model model) {
		model.addAttribute("listEmployee", this.ES.EmployeeList());
		return "Employee";
	}
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
	public String addnewEmployee(Model model) {
		model.addAttribute("employee",new Employee());
		model.addAttribute("listEmployee", this.ES.EmployeeList());
		return"AddEmployee";
	}
	
	@RequestMapping(value="/ToController" ,method=RequestMethod.POST)
	public String addEmloyee(@ModelAttribute("employee")Employee emp) {
		if(emp.getId() == 0){
			//new person, add it
			this.ES.addEmployee(emp);
		}else{
			//existing person, call update
			this.ES.updateEmployee(emp);
		}
		
		return "redirect:/list";
	}
		
	@RequestMapping(value="/delete/{id}")
	public String removeEmployee(@PathVariable("id")int id) {
		this.ES.removeEmployee(id);
		return"redirect:/list";
	}
	
	@RequestMapping(value="/edit/{id}")
	public String editEmployee(@PathVariable("id")int id,Model  model) {
		model.addAttribute("employee", this.ES.getemployeeById(id));
		return  "UpdateEmployee";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String TController2(@ModelAttribute("employee")Employee emp,Model model)
	{
		model.addAttribute("employee", new Employee());		
		this.ES.updateEmployee(emp);
		return "redirect:/list";
	}
	

	
	

}
