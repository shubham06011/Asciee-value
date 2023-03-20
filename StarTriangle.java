import java.util.Scanner;
public class StarTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int a = scan.nextInt();
		for(int i=0;i<=a;i++) {
			System.out.print("");
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
