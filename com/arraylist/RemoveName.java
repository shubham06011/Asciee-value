package com.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	ArrayList<String> obj = new ArrayList<>();
	System.out.println("enter the number");
	int num = scanner.nextInt();
	for(int i=1;i<=num;i++) {
		obj.add(scanner.next());
		
	}
	System.out.println(obj);
	
	}
}
