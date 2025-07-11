package com.cg.EmployeeManagementSystemWebApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.EmployeeManagementSystemWebApplication.entity.Employee;
import com.cg.EmployeeManagementSystemWebApplication.repository.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
 EmployeeRepo repo;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
	   return repo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
	

}
