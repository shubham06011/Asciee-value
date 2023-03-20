package com.velocity.bankofbaroda;
import java.util.Scanner;
public class BankOfBaroda {
	//public static void getInputs() {
Scanner scanner = new Scanner(System.in);
{System.out.println("ENTER THE BALANCE AMOUNT");}
 Float amount = scanner.nextFloat();
 { System.out.println("ENTER 1 FOR WITHDRAWl THE MONER AND ENTER 2 FOR DEPOSIT THE MONEY" );}
 int option = scanner.nextInt();
 {System.out.println("ENTER THE PIN");}
 int pin = scanner.nextInt();
 public void getWithdraw() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("ENTER THE  AMOUNT FOR WITHDRAW");
	 float getamt = scanner.nextFloat();
	 if(getamt<= amount) {
		 Float withdraw = amount - getamt;
		 System.out.println("THE AMOUNT IS WITHDRAW SUCCESFULLY AND THE BALANCE IS " +withdraw);
	 }
	 else if(getamt>amount) {
		 System.out.println("INVALID AMOUNT");
	 }
 }
 public void getDeposit() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("ENTER THE  AMOUNT FOR DEPOSIT");
	 float getamt = scanner.nextFloat();
	 if(getamt<=30000) {
		 Float deposit = amount + getamt;
		 System.out.println("THE AMOUNT IS DEPOSITED SUCCESFULLY AND THE BALANCE IS " +deposit);
	 }
	 else if(getamt>30000) {
		 System.out.println("AMOUNT LIMIT EXCEEDS");
	 }
 }
	 public static void main(String[] args) {
		 BankOfBaroda bank = new BankOfBaroda();
		 
		 if(bank.option==1 && bank.pin ==1234) {
			 bank.getWithdraw();
		 
	 }
		 else if(bank.option==2 && bank.pin==1234) {
			 bank.getDeposit();
		 }
		 else {
			 System.out.println("INVALID INPUTS");
		 }
	 
		 
	 }
 }
	 


