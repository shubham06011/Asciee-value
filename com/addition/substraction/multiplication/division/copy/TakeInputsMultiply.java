package com.addition.substraction.multiplication.division.copy;
import java.util.Scanner;
public class TakeInputsMultiply {
	public static void getMultiply() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the 1st number;");
	int a = scanner.nextInt();
	System.out.println("enter the 2nd number;");
	int b = scanner.nextInt();
	int c = a*b;
	System.out.println(" the multiplication is " +c);
	}
	public static void main(String[] args) {
		TakeInputsMultiply obj3 = new TakeInputsMultiply();
		getMultiply();
		
	}

}
