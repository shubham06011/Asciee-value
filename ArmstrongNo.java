import java.util.Scanner;
public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		int sum=0;
		int num1 = num;
		
		while(num>0) {
			int div=num%10;
			int rem= div*div*div;
			 sum = sum + rem;
			 num = num/10;
		}
			if(num==sum) {
				System.out.println("the number is ARMSTRONG");
			}
			else {
				System.out.println("the number is NOT ARMSTRONG");
			}
		}}
	
          

