package unit_test_04_shad;

public class Factorial_Odd {

	public static void main(String[] args) {
		
// Q13. Write the program to find the factorial of all odd numbers between 1 - 5 
		
		int a = 1;
		
		while(a <= 5)
		{
			if(a % 2 != 0)
			{
				
				int i = 1;
				int fact = 1;
				
				while(i <= a)
				{
					fact *= i;
					i++;
				}
				System.out.println("Factorial of number " + a + " is : " + fact);
			}
			a++;
		}

	}

}
