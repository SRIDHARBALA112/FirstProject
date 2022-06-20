package com.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeerepo;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeerepo.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Employee emp=employeerepo.findById(id).orElseThrow();
		
		
		return emp;
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		 employeerepo.save(employee);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		
		employeerepo.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepo.save(employee);
		
	}



}
