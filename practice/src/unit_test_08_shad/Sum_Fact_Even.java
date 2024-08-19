package unit_test_08_shad;

public class Sum_Fact_Even {

	public static void main(String[] args) {
		
//Q1. WAP to find the sum of Factorial of all even numbers between 2-10.
		
		int sum = 0;
		
		for(int i = 2 ; i <= 10 ; i++)
		{
			if(i % 2 == 0)
			{
				int fact = 1;
				
				for(int j = 1 ; j <= i ; j++)
				{
					fact = fact * j;
				}
				
				//System.out.println("Factorial of " + i + " is : " + fact);
				
				sum = sum + fact;
			}
		}
		
		System.out.println("Sum of Factorial of all even numbers : " + sum);

	}

}
