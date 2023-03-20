package com.stringmethods;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number");
       String word = scanner.next();
       String rev = "";
       for(int i=word.length()-1;i>=0;i--) {
       char ch = word.charAt(i);
       rev = rev + ch;
       }
       
       

System.out.println("the reverse of string is " +rev);
}}








/*System.out.println("enter the name")
String name = scanner.next();
String rev="";
for(int i = name.length()-1;i>=0;i--) {
	char ch = name.charAt(i);
	rev = ch+rev;
}
System.out.println(rev);*/












