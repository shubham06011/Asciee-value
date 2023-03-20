package com.addition.substraction.multiplication.division.copy;
import java.util.Scanner;
public class TakeInputsDivide {
 public static void getDivide() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("enter the 1st number;");
		float a = scanner.nextFloat();
		System.out.println("enter the 2nd number;");
		float b = scanner.nextFloat();
		float c = a/b;
		System.out.println("the answer is :" +c);
 }
 public static  void main (String[] args){
	 TakeInputsDivide obj4 = new TakeInputsDivide();
	 getDivide();
	 
 }
}
