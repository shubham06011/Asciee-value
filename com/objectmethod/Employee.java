package com.objectmethod;

public  class Employee {
	int rollno;
	String name;
	//Make a constructor 
	public Employee(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + "]";
	}
	public static Employee getStudent() {
		Employee emp = new Employee(142,"shru");
		//System.out.println(emp);
		return emp;
		
	}
	public static void main(String[] args) {
		//Employee emp =
				getStudent();
		//System.out.println(emp);
	}

}
