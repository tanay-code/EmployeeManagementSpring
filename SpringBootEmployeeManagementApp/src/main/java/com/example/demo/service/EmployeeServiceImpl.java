package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo repository;

	@Override
	public String addEmployee(Employee employee) {
		Employee emp = repository.save(employee);
		if(emp != null) {
			return "Employee saved Successfully";
		}else {
			return "Failed To Save Employee";
		}
	}
	
}
