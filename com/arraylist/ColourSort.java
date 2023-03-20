package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColourSort {
	public  ArrayList<String> getEnterColour(){
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> obj = new ArrayList<>();
		System.out.println("enter the num");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println("enter the name");
			obj.add(scanner.next());
		}
		Collections.sort(obj);
		return obj;
	}
    public static void main(String[] args) {
    	ColourSort colour = new ColourSort();
    	ArrayList<String> d = colour.getEnterColour();
    	System.out.println(d);
    }
}
			
			
		
		
		
