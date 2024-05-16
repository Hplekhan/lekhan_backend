package com.excel.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.excel.demo.entity.Employee;


public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
