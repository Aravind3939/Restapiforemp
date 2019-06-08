package com.chemistry.math.service;

import com.chemistry.math.model.Employee;
import java.util.Random;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;




@Component
public class EmployeeService {
	
	private static List<Employee> emp =new ArrayList<>();
	
	static
	{
		Employee e1=new Employee(1,"Ramidi","Aravind",1000000);
		Employee e2=new Employee(2,"Ramidi","Bhavana",20000);
		emp.add(e1);
		emp.add(e2);
	}

	public List<Employee> retrieveAllEmployees()
	{
		return emp;
	}
	
	public Employee retrieveEmployee(int Id) {
		for (Employee e : emp) {
			if (e.getId()==Id) {
				return e;
			}
		}
		return null;
	}
	
	public static Employee addEmp( Employee e1) {
		emp.add(e1);
		return e1;
	}
	

}
