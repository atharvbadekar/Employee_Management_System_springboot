package com.sprinboot.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinboot.employee.entity.Employee;
import com.sprinboot.employee.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/id={id}")
	public Employee getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@GetMapping("/")
	public List<Employee> getAll(){
		return service.getAll();
	}
	
	@PutMapping("/update/id={id}")
	public Employee updateById(@PathVariable int id ,@RequestBody Employee e) {
		return service.updateById(id, e);
	}
	@DeleteMapping("/id={id}")
	public Object deletById(@PathVariable int id) {
		return service.deletById(id);
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@GetMapping("/name={name}")
	public Employee findByName(@PathVariable String name) {
		return service.findByName(name);
	}

}
