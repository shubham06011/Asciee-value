package com.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListName {
	public LinkedListName(String next) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedList obj = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		//System.out.println("enter the num");
		//int num = scanner.nextInt();
		//for(int i =1;i<=num;i++) {
		 //obj.add(new LinkedListName(scanner.next()));
		 obj.add("shubham");
		 obj.add("samiksha");
		 
		 for(Object v:obj) {
			 System.out.println(v);
		 }
		
	}
	}

