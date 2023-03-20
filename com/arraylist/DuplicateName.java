package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class DuplicateName {
 public static ArrayList<StudentDetails> getEmployeeinfo() {
	  ArrayList<StudentDetails> obj = new ArrayList();
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("enter the numer");
	  int num = scanner.nextInt();
	  for(int i=1; i<=num ; i++) {
		  System.out.println("enter the info");
		  obj.add(new StudentDetails(scanner.nextInt(),scanner.next(),scanner.next(),scanner.nextInt()));
		  
	  }
	return obj;
	
		  
	  }
 public static void main(String[] args) {
	 
	
 }
}
