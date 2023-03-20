import java.util.Scanner;
public class PrintingTable {
 public void getNumber() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("enter the number" );
	 int a = scanner.nextInt();
	//int i=1;
	  for(int i=1;i<=10;i++){
	 System.out.println(a +"x" +i+"=" +(a*i) );
 }}
	  public static void main(String[] args){
	  PrintingTable table = new PrintingTable();
	  table.getNumber();
}}
