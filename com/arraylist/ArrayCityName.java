package com.arraylist;

import java.util.ArrayList;

public class ArrayCityName {
 public static void main(String[] args) {
	 ArrayList<String> obj1 = new ArrayList<>();
	 obj1.add("nagpur");
	 obj1.add("Nagpal");
	 obj1.add("Nashik");
	 obj1.add("Narkhed");
	 obj1.add("Nanadgao");
	 
	 
	 for(String s:obj1) {
		 System.out.println(s);
	 }
 }
}
