package caps_28_shad;

//WAP in java take class as Student details and explain the use of
//a. static method
//b. static variable
//c. static block

public class Students {

	String name;
	int age;
	String dob;
	static String college = "MITM";
	
	public static void main(String[] args) {
		
		Students obj = new Students();
		Students obj2 = new Students();
		Students obj3 = new Students();
		
		obj.name = "Shadab";
		obj.age = 23;
		obj.dob = "22/01/2001";
		System.out.println("Student 1 Name : " + obj.name);
		System.out.println("Student 1 College : " +obj.college);
		
		obj2.name = "Ali";
		obj2.college = "KCC";
		System.out.println("Student 2 Name: " +obj2.name);
		System.out.println("Student 2 College : " +obj2.college);
		
		obj3.name = "Hussain";
		System.out.println("Student 3 Name : " +obj3.name);
		System.out.println("Student 3 College : " +obj3.college);
		
		System.out.println("Student 1 College : " +obj.college);
	}

}
