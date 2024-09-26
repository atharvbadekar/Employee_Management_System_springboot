package com.sprinboot.employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprinboot.employee.entity.Employee;
import com.sprinboot.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public Employee getById(int id) {
		return repo.findById(id).get();
	}
	
	public List<Employee> getAll(){
		return repo.findAll();
	}
	
	public Employee updateById(int id , Employee e) {
		e.setId(id);
		return repo.save(e);
	}
	
	public Object deletById(int id) {
		repo.deleteById(id);
		return id;
	}
	
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	public Employee findByName(String name) {
		return repo.findByName(name);
	}

}
