package com.cg.EmployeeManagementSystemWebApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.EmployeeManagementSystemWebApplication.entity.Employee;
@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{

}
