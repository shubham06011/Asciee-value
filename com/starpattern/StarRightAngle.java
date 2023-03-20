package com.starpattern;
import java.util.Scanner;
public class StarRightAngle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i =1; i<=a;i++) {      // rows
			System.out.print("");
		
			for(int k=1; k<=i;k++) {   // columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}}


