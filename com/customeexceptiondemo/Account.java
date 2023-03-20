package com.customeexceptiondemo;
import java.util.Scanner;
public class Account {
	
	public void accountDetails() {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("ente the amount");
	int Amount=scanner.nextInt();
	
	System.out.println("enter amount for withdrawl");
	int Withdrawl=scanner.nextInt();
	
	if(Withdrawl>Amount) {
		throw new AmountNotSufficientException ("you have less balance sorry Aukat me Rahe");
	}
	else {
		int Balance=Amount-Withdrawl;
		System.out.println("the rest amount is" +Balance);
	}
}
}