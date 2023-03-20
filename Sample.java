
/*public class Sample {
	int a = 15;
	int b = 13;	
	
	public  void getAdd() {
			
	int sum = a + b ;
	
	
	System.out.println("addition is " +sum);
	}
	public static void getSub() {
		int a = 15;
		int b = 12;
		int h = a - b;
		System.out.println("Substraction is " +h);
	}
	public static void main(String[] args) {
    Sample sum = new Sample();
    sum.getAdd();
    getSub();
}
}*/

/*public class Sample{
	int a = 40;
	int b = 30; 
	
	
	
	public int getAdd() {
		int c = a + b;
		return c ;
	}
	public float getSub() {
		float d = a-b;
		return d;
		
	}
	public int getProduct() {
		int e = a*b;
		return e;
	}
	public float getDivision() {
		float f = a/b;
		return f;
	}
	
		    public static void main (String[] args) {
			Sample value = new Sample();
			int x = value.getAdd();
			float y = value.getSub();
			int z = value.getProduct();
			float k= value.getDivision();
			System.out.println("the add is " +x );
			System.out.println("the sub is " +y );
			System.out.println("the product is " +z);		
			System.out.println("the product is " +k);
			
		}
	}*/


/*public class Sample{
	int eng = 70;
	int chem = 60;
	int phy = 88;
	int maths = 60;
	int cs = 50;
	 public float getAve(){
		float c = (eng + chem + phy + maths + cs);
		float e = c/5;
		return e;
		}
		public static void main(String[] args) {
			Sample average = new Sample();
			float d = average.getAve();
				System.out.println("the Average of Students marks " +d);	
	}
}*/

	
/*public class Sample{
	public static void main(String[] args) {
		int f= 75;
		// i= 50;
	    //int g=i+1;
		for(int i=50; i<=75;i+=2) {
			//int g=i+2;
			   // g++;
			System.out.println(i);
				}
	
}}*/

		import java.util.Scanner;
		public class Sample{
			
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
		




/*import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sample extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.RED);
    int xPoints[] = {100, 150, 200};
    int yPoints[] = {100, 50, 100};
    g.fillPolygon(xPoints, yPoints, 3);
    g.fillArc(75, 100, 50, 50, 0, 180);
    g.fillArc(175, 100, 50, 50, 0, 180);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Heart Shape");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.add(new Sample());
    frame.setVisible(true);
  }
}*/

		
		



	
	
	
	
	