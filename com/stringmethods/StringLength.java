package com.stringmethods;
import java.util.Scanner;
public class StringLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number");
		String word = scanner.next();
		System.out.println("the length of above string is " +word.length());
	}

}
