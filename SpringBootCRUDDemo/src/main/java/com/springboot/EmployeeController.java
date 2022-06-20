package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	@GetMapping("/employees")
	public List<Employee>findAll(){
		return service.findAll();
	}
	@GetMapping("/employees/{id}")
	public Employee findById(@PathVariable int id) {
		return service.findById(id);
	}
	@PostMapping("/employees")
	public void saveEmployee(@RequestBody Employee employee) {
	 service.saveEmployee(employee);
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return service.updateEmployee(employee);
	}
	@DeleteMapping("/employees/{id}")
		public void deleteEmployee(@PathVariable int id) {
	
    	 service.deleteEmployee(id);
     }
}
