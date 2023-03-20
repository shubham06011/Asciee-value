import java.util.Scanner;
public class FizzBuzz {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the no");
	
	 
	 
	for(int i=1;i<=18;i++) {
	
	
	
	 if(i %3==0) {
		 System.out.println(i+"fizz");
		 if(i%3==0 && i%5==0) {
			 System.out.println(i+"fizzbuzz");
		 }
	 }
	 else if(i%5==0) {
		 
		 System.out.println(i+"buzz");
		 
	 }
	 // if(i%3==0 && i%5==0) {
		// System.out.println(i+"fizzbuzz");
	 }//
	}}
 
