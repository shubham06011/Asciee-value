//USING if-else statement
/*public class Password {
	public static void main (String [] args) {
    int  name = 10;
	int password = 20;
	
	    if((name==10) || (password == 30)) {
		      System.out.println("numbers are valida");
	       }
	    else {
	        System.out.println("numbers are not valid");
	    }
		

		
	}
}*/


// SWITCH CASE METHOD 
/*public class Password {
	public static void main (String [] args) {
String x="shrunkhal";
switch(x){
case "shrikant":
System.out.println(4);
break;
case "shrunkhal":
System.out.println(2);
case "truvi":
System.out.println(3);
break;
case "shubham":
System.out.println(5);
break;
default:
System.out.println("out");
}
	}
}*/
import java.util.Scanner;
public class Password {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");	
	int percentage = scanner.nextInt();
	if((percentage==99)&&(percentage>=90)) {
		System.out.println("you got A gread");
	}
	else if ((percentage < 90) && (percentage>=80)) {
		System.out.println("you got B gread");
	}
	else if ((percentage < 80) && (percentage>=70)) {
		System.out.println("you got c gread");
	}
	else if ((percentage < 70) && (percentage>=60)) {
		System.out.println("you got D gread");
	}
	else if ((percentage < 60) && (percentage>=50)) {
		System.out.println("Sorry to say but you are fail");
	}
	else {
		System.out.println("KEEP HUSTLING");
	}
	}
}

	
