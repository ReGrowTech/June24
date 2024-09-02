package functions_shad;

public class Parameterized_Non_Parameterized {

	public static void main(String[] args) {
		
		Parameterized_Non_Parameterized.Parameter(5, 2);
		
		Parameterized_Non_Parameterized.Non_Parameter();

	}
	
	public static void Parameter(int a, int b) {
		
		int c = a * b;
		System.out.println( "Multiplication : " + c);
		
	}

	public static void Non_Parameter() {
		
		System.out.println("Hello, I am non- parameterized function");
		
	}
}
