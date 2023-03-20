import java.util.Scanner;
public class PositiveNegative {
	public static void getNum() {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int a = scanner.nextInt();
		if (a>=0) {
			System.out.println("The number is Positive");
		}
			else  {
				System.out.println("the number is Negative");
			}
		}
	public static void main(String[] args) {
		PositiveNegative check = new PositiveNegative();
		
		getNum();
	}
	}


