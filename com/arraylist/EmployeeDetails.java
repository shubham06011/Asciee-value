package com.arraylist;
import java.util.Scanner;
import java.util.ArrayList;

//import com.arraylistdemo.Student;

/*public class EmployeeDetails {
	public static ArrayList<Employee>  getEmployeeDetails() {
		ArrayList<Employee> obj = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the inputs");
		obj.add(new Employee(scanner.next(),scanner.nextInt()));
		obj.add(new Employee("shrunkhal",786));
		obj.add(new Employee("vishal",143));
		return obj;
	}
		public static void main(String[] args) {
			ArrayList<Employee> emp = getEmployeeDetails();
			for( Employee k:emp ) {
			System.out.println(k);
		}
}}*/
		
		public class EmployeeDetails {
			public static ArrayList<Employee>  getEmployeeDetails() {
				ArrayList<Employee> obj = new ArrayList<>();
				Scanner scanner = new Scanner(System.in);
				System.out.println("enter the no of entries");
		int a = scanner.nextInt();
		for(int i=0;i<=a;i++) {
			System.out.println("enter the inputs");
			obj.add(new Employee(scanner.next(),scanner.nextInt()));
			
		}
		return obj;
		
		}
		public static void main(String[] args) {
			ArrayList<Employee> emp = getEmployeeDetails();
			for( Employee k:emp ) {
			System.out.println(k);
		}}}

