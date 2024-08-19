package unit_test_04_shad;

public class Fizz_Buzz {

	public static void main(String[] args) {
	
// Q9. Write a program to check whether the number is Fizz, Buzz, or both Fizz & Buzz.
		
		int n = 9;
		
		if(n % 3 == 0 && n % 5 == 0)
		{
			System.out.println("Both Fizz & Buzz ");
		}
		else if(n % 3 == 0)
		{
			System.out.println("Just Fizz");
		}
		else if(n % 5 == 0)
		{
			System.out.println("Just Buzz");
		}
		else
		{
			System.out.println("Neither Fizz nor Buzz");
		}

	}

}
