package com.addition.substraction.multiplication.division.copy;
import java.util.Scanner;
public class TakeInputsAdd {
	public static void getAdd() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("enter the first no");
  int a = scanner.nextInt();
  System.out.println("the first no. is " +a);
  System.out.println("enter the second no");
  int b = scanner.nextInt();
  System.out.println("the second no. is " +b);
  int c = a+b;
  System.out.println("the addition is " +c);
	}
  public static void main(String[] args) {
	  TakeInputsAdd add = new TakeInputsAdd();
	  
	  getAdd();
}}
