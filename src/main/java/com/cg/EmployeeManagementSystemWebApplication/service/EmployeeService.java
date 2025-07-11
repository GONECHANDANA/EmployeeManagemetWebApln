package com.cg.EmployeeManagementSystemWebApplication.service;

import java.util.List;

import com.cg.EmployeeManagementSystemWebApplication.entity.Employee;

public interface EmployeeService {
  public List<Employee>getAllEmployees();
 public void saveEmployee(Employee employee);	
 public Employee getEmployeeById(int id);
 public void deleteById(int id);
 
 
 
 
 
}
