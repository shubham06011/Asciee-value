package com.map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class NameSort {
	public static void main(String[] args) {
		HashMap<Integer,String> obj = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println("enter the name");
			obj.put(scanner.nextInt(),scanner.next());
			
		}
		System.out.println("Before sorting "+obj);
		TreeMap<String,Integer> map=new TreeMap(obj);
		System.out.println("After sorting " +map);
	}
	

}
