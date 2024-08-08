package unit_test_6;

public class Even_Factorial {

	public static void main(String[] args) {
		
//Q8. WAP to find the factorial of all the even numbers. between 10-1.
		
		for(int i = 10 ; 1 <= i ; i--)
		{
			int fact = 1;
			
			if(i % 2 == 0)
			{
				for(int j = 1 ; j <= i ; j++)
				{
					fact = fact * j;
				}
				
				System.out.println("Factorial of " + i + " is :" + fact);
			}
			
		}
			

	}

}
