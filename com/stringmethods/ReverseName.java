package com.stringmethods;

public class ReverseName {
 public static void main(String[] args) {
	 String name = "shubam";
	 String rev ="";
	 for(int i=name.length()-1;i>=0;i--) {
		 char ch = name.charAt(i);
		 rev = rev+ch;
		 
	 }
	 System.out.println("the reverse is " +rev);
			 
 }
}
