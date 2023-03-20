package com.arraylist;

public class StudentDetails {
	private int EmpId;
	private String Name;
	private String Dept;
	private int Age;
	@Override
	public String toString() {
		return "StudentDetails [EmpId=" + EmpId + ", Name=" + Name + ", Dept=" + Dept + ", Age=" + Age + "]";
	}
	public StudentDetails(int empId, String name, String dept, int age) {
		super();
		EmpId = empId;
		Name = name;
		Dept = dept;
		Age = age;
	}

}
