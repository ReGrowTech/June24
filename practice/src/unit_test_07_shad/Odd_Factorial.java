package unit_test_07_shad;

public class Odd_Factorial {

	public static void main(String[] args) {
		
//Q3. WAP to find the factorial of all the odd numbers. between 10-1.
		
		for(int i = 10 ; 1 <= i ; i--)
		{
			if(i % 2 != 0)
			{
				int fact = 1;
				
				for(int j = 1 ; j <= i ; j++)
				{
					fact = fact * j;
				}
				
				System.out.println("Factorial of " + i + " is : " + fact);
			}
			
		}
	}

}
