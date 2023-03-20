package com.arraylist;

public class Employee {
	private String name;
	private int employeeId;
	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", employeeId=" + employeeId + "]";
	}
	public Employee(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}
	
}