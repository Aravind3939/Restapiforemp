package com.chemistry.math.model;

public class Employee {

	int id;
	String first;
	String last;
	int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String first, String last, int salary) {
		super();
		this.id = id;
		this.first = first;
		this.last = last;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}
