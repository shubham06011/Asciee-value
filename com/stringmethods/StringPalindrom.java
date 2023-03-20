package com.stringmethods;

import java.util.Scanner;

public class StringPalindrom {
	
		public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the word");
	       String word = scanner.next();
	       String rev = "";
	       for(int i=word.length()-1;i>=0;i--) {
	       char ch = word.charAt(i);
	       rev = rev + ch;
	       }
	       
	       
	       if(word.toLowerCase() .equals (rev.toLowerCase())) {
	    	   System.out.println("thid is palindrom");
	       }}}



