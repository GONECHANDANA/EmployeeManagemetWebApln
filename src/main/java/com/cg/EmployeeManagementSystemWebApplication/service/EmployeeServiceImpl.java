package com.cg.EmployeeManagementSystemWebApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // ✅ Make sure to import this

import com.cg.EmployeeManagementSystemWebApplication.entity.Employee;
import com.cg.EmployeeManagementSystemWebApplication.repository.EmployeeRepo;

@Service  // ✅ This tells Spring to treat this as a bean
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        repo.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
