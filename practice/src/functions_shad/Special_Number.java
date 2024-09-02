package functions_shad;

public class Special_Number {

	public static int  spcl(int n) 
	{

		int ld;
		int sum = 0;
		
		while(n > 0)
		{
			ld = n % 10;
			n = n / 10;
			
			int fact =  Factorial.factorial(ld);
			
			sum = sum + fact;
			
		}
		return sum;
	}
	
	public void check(int sum , int n)
	{

		if(sum == n)
		{
			System.out.println("Special Number");
		}
		else
		{				
			System.out.println("Not a Special Number");
		}
		
	}
}
		
	
		
	


