import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scanner.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}}
				if(count==2) {
					System.out.println("prime no" +a);
				}
			
				else {
					System.out.println("not prime no " +a);
				}
			}
		
		
	
	

}
