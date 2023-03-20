package com.array;
import java.util.Scanner;
public class MissingNumbers {
	 public static void main(String[] args) {

		
		   int[] a = {1,2,3,4,6,7};
		    int numsum =  a.length + 1;
		   int expected_num_sum = numsum* ((numsum + 1) / 2);
		   int num = 0;
		   for (int i: a) {
		    num= num + i;
		   }
		       System.out.println( expected_num_sum - num);
			   //System.out.print("\n");
		  }
		 }

