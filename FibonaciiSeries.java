import java.util.Scanner;
public class FibonaciiSeries {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number");
	int a = scanner.nextInt();
	int b = 0;
	int c = 1;
	for(int i=1;i<=a;i++) {
		System.out.println(b);
		int d = b+c;
		b=c;
		c=d;
		
	}
			
}
}
