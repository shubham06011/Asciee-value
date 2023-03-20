import java.util.Scanner;
public class GreatrNum {
public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a ");
	int a= scanner.nextInt();
	System.out.println("Enter b ");
	int b = scanner.nextInt();
	System.out.println("Enter c ");
	int c = scanner.nextInt();
	if(a > b && a > c) {
		System.out.println(" a is greater");
	}
	else if(b>a && b>c) {
		System.out.println("b is greater");
	}
	else if(c>a && c>b) {
			System.out.println("c is greater");
		}
	}
}


