package com.starpattern;

import java.util.Scanner;

public class MirrorRightAngle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a :");
	int a = scanner.nextInt();
	System.out.println("enter b :");
	int b = scanner.nextInt();
	for(int i =1;i<=a;i++) {
		for(int j=b;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k =1;k<=i;k++) {
			System.out.print("*");
	}
		System.out.println();
	}
	}
}

