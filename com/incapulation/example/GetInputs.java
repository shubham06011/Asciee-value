package com.incapulation.example;
import java.util.Scanner;
public class GetInputs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the EmpId:");
		int EmpId = scanner.nextInt();
		
		System.out.println("enter the PhnNo:");
        Long PhnNo = scanner.nextLong();
        
        System.out.println("enter the EmpName:");
        String  EmpName = scanner.next();
        
        System.out.println("enter the EmpCountry:");
        String EmpCountry = scanner.next();
		
	
         Encapsulation obj1 = new Encapsulation();
         
         
	    obj1.setEmpId(EmpId);
	    obj1.setPhnNo(PhnNo);
	    obj1.setEmpName(EmpName);
	    obj1.setEmpCountry(EmpCountry);
	    
	    
	    
	    System.out.println("EmpId is>>" + obj1.getEmpId());
		System.out.println("Emp name is>>" + obj1.getPhnNo());
		System.out.println("Emp salary is>>" + obj1.getEmpName());
		System.out.println("Emp country is>>" + obj1.getEmpCountry());
	}
	    
	    
	
}
