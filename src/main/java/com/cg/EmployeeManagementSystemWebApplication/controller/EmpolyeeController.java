package com.cg.EmployeeManagementSystemWebApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.EmployeeManagementSystemWebApplication.entity.Employee;
import com.cg.EmployeeManagementSystemWebApplication.service.EmployeeService;

@RestController
public class EmpolyeeController {
	@Autowired
	EmployeeService service;
	@GetMapping("/")
	public String viewHomePage(Model model) {
		 model.addAttribute("listEmployees", service.getAllEmployees());
		return "list";
	}
	@GetMapping("/showEmpolyeeForm")
 public String showNewEmployeeForm(Model model) {
	 model.addAttribute("employee",new Employee());
	return "create";
	}
	@PostMapping("/saveEmployee")
  public String saveEmployee(@ModelAttribute("employee")Employee employee) {
		service.saveEmployee(employee);
	return "redirect:/";
	  
  }
	@GetMapping("/showFormForUpdate/{id}")
 public String showFormForUpdate(@PathVariable int id, Model model) {
	 Employee emp=service.getEmployeeById(id);
	 model.addAttribute("employee",emp);
	return "edit";
	 
 }
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee( @PathVariable int id) {
		service.deleteById(id);
		return "redirect:/";
	}
	
}
