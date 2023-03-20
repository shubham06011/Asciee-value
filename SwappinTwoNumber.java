//SWAPPING NUMBER PROBLEM USING 4 VARIABLES
/*import java.util.Scanner;
public class SwappinTwoNumber {
   public  void getVariable () {
	   Scanner scanner = new Scanner(System.in);
	   int a =scanner.nextInt();
	   int b =scanner.nextInt();
	   int c= a;
	   int d=b; 
	   System.out.println("the numbers are " +c +" " +d);
	   //int e= 
   }
   public static void main(String[] args) {
	   SwappinTwoNumber obj1 = new  SwappinTwoNumber();
	   obj1.getVariable();
	   
   
}
}*/

//SWAPPING NUMBER PROBLEM USING 3 VARIABLES
import java.util.Scanner;
public class SwappinTwoNumber {
	
   public  void getVariable () {
	   Scanner scanner = new Scanner(System.in);
	   int a =scanner.nextInt();
	   int b =scanner.nextInt();
	  int c;
	  // Using 3 Variable
	   c=a;
	   a=b;
	   b=c;
	   //System.out.println("the numbers are " +a +" " +b);
	  // Using 2 variable
	  // a =a+b;
	 //  b=a-b;
	 //  a=a-b;
	   System.out.println("the numbers are " +a +" " +b);
   }
   public static void main(String[] args) {
	   SwappinTwoNumber obj1 = new  SwappinTwoNumber();
	   obj1.getVariable();
   }}