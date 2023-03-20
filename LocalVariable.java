public class LocalVariable {
    int x=33;              //Global variable
	public static void main(String[] args) {
		int a=50 ;        // local variable
		System.out.println(a);
		LocalVariable var1=new LocalVariable();
		System.out.println(var1.x);
	}
}