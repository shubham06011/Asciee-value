public class Methods {
	int mathMarks=34;
	int englishMarks=55;
	int scienceMarks=78;
	
	public void getTotal() {
		
		int total = mathMarks+ englishMarks +scienceMarks;
		
		System.out.println("Total marks is "+total);		
	}
	public int getResult(int id,String name ) {
		int result =mathMarks+ englishMarks +scienceMarks;
		//System.out.println(id);
		//System.out.println(name);
		return result;
		
	}
	public static void getStudentName( ) {
		System.out.println("Student  name is  shanku ");	
		
	}
	//Passing Arguments
	 public static void getStudentDetails(int id ,String name) {
		 System.out.println("Name is  "+ name);
		 System.out.println("ID is "+id);
		 	 
	 }
	 public static void main(String[]args) {
		 
		 Methods student = new Methods();
		 student.getTotal();
		 int result=student.getResult(102,"shubham");
		 System.out.println("Total marks is "+result);
		 getStudentName();
		 getStudentDetails(101,"shanku");
		 
	 }
				
}

//ASSIGNMENT=Design the separate method as String getStudentName (String name) which return student name and print it.


