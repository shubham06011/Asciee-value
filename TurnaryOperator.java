import java.util.Scanner;	
public class TurnaryOperator {
	
	public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("enter the number");
  int a = scanner.nextInt();
  System.out.println("enter the number");
  int b = scanner.nextInt();
  String c = (a>b)?"shubham":"shrunkhal";
  System.out.println(c);
}
}