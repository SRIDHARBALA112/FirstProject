package com.springboot;

import java.util.List;

public interface EmployeeService  {
	
	public List<Employee>findAll();
	public Employee findById(int id);
	public void saveEmployee(Employee employee);
	//public Employee updateEmployee(Employee employee,int id);
	public void deleteEmployee(int id);
	public Employee updateEmployee(Employee employee);

}
