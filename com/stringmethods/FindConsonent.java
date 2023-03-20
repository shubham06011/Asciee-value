package com.stringmethods;

import java.util.Scanner;
public class FindConsonent {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your name");
	String name = scanner.next();
	int vcount = 0; //for vowels
	int count = 0; // for consonent
	for(int i =0;i<name.length();i++) {
		char ch = name.charAt(i);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
			 //System.out.println(ch);
			vcount++;
		}
		else{
			//System.out.println(ch);
			count++;
		}
			
		}
	     System.out.println(vcount);
	     System.out.println(count);
	}}
	
