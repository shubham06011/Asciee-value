import java.util.Scanner;

public class CubeNumber {
	public int getCube(int a) {
		//Scanner scanner = new Scanner(System.in);
		//int a = scanner.nextInt();
		int c = a*a*a;
		return c;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sample obj = new Sample();
		System.out.println("enter the number");
		int d= obj.getCube(scanner.nextInt());
		System.out.println(d);
	}
}


