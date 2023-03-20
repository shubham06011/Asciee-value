package com.constructorchaining;

public class SubClass{ //extends SuperName {
	SubClass(){
		this(154);
		System.out.println("print this is india");
	}
	SubClass(int i){
		this(101,"SHRUNKHAL");
		System.out.println("this is pakistan");
		}
	SubClass(int i , String name){
		System.out.println("this is shrilanka");   //here we didn't give any constructor that's why 
	}
	public static void main(String[] args) {
		SubClass obj1 = new SubClass();
		
	}}
	
		
		
	


