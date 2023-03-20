package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortName {
	public static ArrayList<String> getInputs() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> obj = new ArrayList<>();
		System.out.println("enter the num");
		int num =scanner.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("enter the name:");
			obj.add(scanner.next());
			
		}
		Collections.sort(obj);
		Collections.reverse(obj);
		System.out.println(obj);
		return getInputs();
	}
	public static void main(String[] args) {
		ArrayList<String> d=  getInputs();
		System.out.println(d);
		
		//getInputs();
		
	}

}
