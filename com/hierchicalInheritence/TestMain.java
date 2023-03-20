package com.hierchicalInheritence;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Option");
		int Option = scanner.nextInt();
		if(Option==1) {
		ICICI iciciBank = new ICICI();
		iciciBank.getICICIDetails();
		}
		else if(Option==2) {
			HDFC hdfcBank = new HDFC();
			hdfcBank.getHDFCDetails();
		}
		else if(Option==3) {
			SBI sbiBank = new SBI();
			sbiBank.getSBIDetails();
			
		}
		
		}
		}
