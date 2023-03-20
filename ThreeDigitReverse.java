import java.util.Scanner;
public class ThreeDigitReverse {
	public int getNumber() {
Scanner scanner = new Scanner(System.in);
System.out.println("enter the number");
int a = scanner.nextInt();
int b = (a%10);
int c = (a/10)%10;
int d = a/100;
int e = (b*100+c*10+d*1);
return e;
	}
	public static void main(String[] args) {
		ThreeDigitReverse obj = new ThreeDigitReverse();
		int g = obj.getNumber();
		System.out.println(g);
	}

}
