package com.stringmethods;
import java.util.Scanner;
public class FindVoewls {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your name");
	String name = scanner.next();
	int count = 0;
	for(int i =0;i<name.length();i++) {
		char ch = name.charAt(i);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
			count++;
		}
			
		}
	     System.out.println(count);
	}
	
}

