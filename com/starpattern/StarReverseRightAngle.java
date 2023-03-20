package com.starpattern;
import java.util.Scanner;
public class StarReverseRightAngle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scanner.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.print("");
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}





