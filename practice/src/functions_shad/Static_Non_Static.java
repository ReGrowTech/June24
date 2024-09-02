package functions_shad;

public class Static_Non_Static {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 10;
		
		Static_Non_Static.add(a, b); //calling static function
		
		Static_Non_Static obj = new Static_Non_Static(); // calling non - static function
		obj.sub(a, b);
	}

	public static void  add(int a, int b) {
		
		int c = a + b;
		System.out.println("addition : " + c);
		
	}
	
	public  void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("subtraction : " + c);
	}
}
