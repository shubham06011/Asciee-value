import java.util.Scanner;
public class SwapNo {
public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the 1st num");
	int a=scanner.nextInt();
	System.out.println("Enter the 2nd num");
	int b= scanner.nextInt();
	System.out.println("the numbers before swapping are " +a +" " +b);
	a = a+b;
    b = a-b;
	a = a-b; 
	
	System.out.println("the numbers after swapping are " +a +" " +b);
}
}
