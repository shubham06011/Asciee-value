import java.util.Scanner;
public class LeapYear {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the Year: ");
 
 int a = scanner.nextInt();
 if(a % 4 == 0) {
  if(a % 100 == 0) {
	  if(a % 400 ==0) {
	  System.out.println("the year is leap and but not century year");
  }}}
	  else {
		  System.out.println("The year is  leap year");
	  }
      
  
  }
  }

