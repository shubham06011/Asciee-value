import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int fact = 1;
		for(int i=1; i<=a;i++) {
			 fact=fact*i;
			System.out.println(fact);
		}
		
	}
}
