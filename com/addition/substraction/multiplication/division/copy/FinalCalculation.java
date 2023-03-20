package com.addition.substraction.multiplication.division.copy;
//import com.addition.substraction.multiplication.division.copy.TakeInputsAdd;
//import com.addition.substraction.multiplication.division.copy.TakeInputsSub;
import com.addition.substraction.multiplication.division.copy.*;
import java.util.Scanner;
public class FinalCalculation {

 public static void main(String[] args) {
	 //FinalCalculation pin = new FinalCalculation();
	 TakeInputsAdd obj1 = new TakeInputsAdd();
	 TakeInputsSub obj2= new TakeInputsSub();
	 TakeInputsMultiply obj3 = new TakeInputsMultiply();
	 TakeInputsDivide obj4 = new TakeInputsDivide();
	 Scanner scanner = new Scanner(System.in);
	// for(int i=1;i<=6;i++) {
	 int i =1;
	 while(i<=2) {
	 System.out.println("enter the pin ");
	 int no = scanner.nextInt();
	 if(no ==1) {
	 obj1.getAdd();
	 }
	 else if(no==2) {
	 obj2.getSub();
	 }
	 else if(no==3) {
	 obj3.getMultiply();	 
	 }
	 else if(no==4) {
		 obj4.getDivide();	 
		 }
	 else {
		 System.out.println("invalid pin " );
	 }
}}
}