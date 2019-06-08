package com.chemistry.math.controller;

import com.chemistry.math.model.Employee;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.chemistry.math.model.Employee;

import com.chemistry.math.service.EmployeeService;
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empy;
	
	 
	@GetMapping("/All")
	public List<Employee> getAllEmployee()
	{
		return empy.retrieveAllEmployees();
	}
	
	@PostMapping("/All")
	public ResponseEntity<Void> addEmployee( @RequestBody Employee newEmp) {
		Employee e1= EmployeeService.addEmp(newEmp);
		if (e1== null)
			return ResponseEntity.noContent().build();
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{id}").buildAndExpand(e1.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	
	@GetMapping("/All/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return empy.retrieveEmployee(id);
	}
	
	
	
	
	

}
