package com.multithreading;
import java.util.Scanner;
public class ByThread extends Thread {
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a= scanner.nextInt();
		for(int i = 1; i<= 10;i++) {
			System.out.println(a +"x" +i +"=" +(a*i));
		}}
		public static void main(String[] args) {
		ByThread obj = new ByThread();
		obj.start();
	}

}
