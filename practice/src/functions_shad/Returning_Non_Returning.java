package functions_shad;

public class Returning_Non_Returning {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//Returning Function
		Returning_Non_Returning obj = new Returning_Non_Returning();
		int check = obj.greater(a, b);
		System.out.println(check + " is greater");

		//Non Returning Function
		Returning_Non_Returning.string("How are you ?");
	}

	public int greater(int a, int b)
	{
		int c = (a > b)? a: b;
		
		return c;
	}
	
	public static void string(String msg)
	{
		System.out.println("Hello, " + msg);
	}
}
