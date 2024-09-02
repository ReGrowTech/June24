package unit_test_10_shad;

//Q2. Write a program in Java to store a student's name as an instance variable and the college name as a static variable. 
//Use a method to display these details along with a locally defined roll number.
	
public class Variables {

	String name;
	static String clg = "RGT";
	
	public static void main(String[] args) {
		
		Variables obj = new Variables();
		Variables obj2 = new Variables();
		Variables obj3 = new Variables();
		
		obj.name = "Mohammad";
		obj2.name = "Shadab";
		obj3.name = "Ali";
		
		int a_roll = 10;
		int b_roll = 15;
		int c_roll = 18;
		
		System.out.println("Student 1 Name : " + obj.name);
		System.out.println("Student 1 Roll No : " + a_roll);
		System.out.println("Student 1 College : " + obj.clg);
		System.out.println();
		
		System.out.println("Student 2 Name : " + obj2.name);
		System.out.println("Student 2 Roll No : " + b_roll);
		System.out.println("Student 2 College : " + obj2.clg);
		System.out.println();
		
		System.out.println("Student 3 Name : " + obj3.name);
		System.out.println("Student 3 Roll No : " + c_roll);
		System.out.println("Student 3 College : " + obj3.clg);
		
		
		
		

		
		
		

	}

}
