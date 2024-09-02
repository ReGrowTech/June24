package caps_29_shad;

//1. WAP in Java using Functions check whether the number is Special Number or not.

public class Special_Number {

	public static void main(String[] args) {
		
		int n = 145;
		
		Special_Number obj = new Special_Number(); // Calling spcl_num method
		int sum = obj.spcl_num(n);
		
		Special_Number.display(n , sum); // Calling display method

	}
	
	public int spcl_num(int n)
	{
		int ld;
		int sum = 0;
		
		while(n > 0)
			
		{
			ld =  n % 10;
			n =  n / 10;
			
			// calling factorial method
			Special_Number obj = new Special_Number();
			int fact = obj.factorial(ld);
			
			sum = sum + fact;
		}
		
		return sum;
	}
	
	public int factorial(int ld)
	{
		int fact = 1;
		
		for(int i = 1 ; i <= ld ; i++)
		{
			fact = fact * i;
		}
		
		return fact;
		
	}
	
	public static void display(int n, int sum)
	{
		if(sum == n)
		{
			System.out.println(n + " is a Special Number");
		}
		else
		{
			System.out.println(n + " is not a Special Number");
		}
	}

}
