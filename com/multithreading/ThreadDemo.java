package com.multithreading;
import java.util.Scanner;
public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a= scanner.nextInt();
		for(int i = 1; i<= 10;i++) {
			System.out.println(a +"x" +i +"=" +(a*i));
		}}
	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		Thread obj2 = new Thread(obj);
		obj2.start();
	}

}
