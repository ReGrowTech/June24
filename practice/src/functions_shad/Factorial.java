package functions_shad;

public class Factorial {

	public static int factorial(int ld)
	{
		int fact = 1;
		
		
		for(int i = 1 ; i <= ld ; i++)
		{
			fact *= i;
		}
	
		return fact;
	}
	
	

}
