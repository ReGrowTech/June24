package unit_test_5;

public class Even_Factorial {

	public static void main(String[] args) {
		
//Q12. Write a program to find the factorial of all even numbers between 2-10. 
		
		int b = 10;
		
		for(int a = 2 ; a <=b ; a++)
		{
			if(a % 2 == 0)
			{
				int fact = 1;
				
				for(int i = 1 ; i <= a ; i++)
				{
					fact = fact * i;
				}
				
				System.out.println("Factorial of " + a + " is : " + fact);
			}
		}
	}

}
