package unit_test_5;

public class Factorial_For_Loop {

	public static void main(String[] args) {
		
// Q7. Write program in Java to print the factorial of a given number using a for loop. 
		
		int n = 6;
		int fact = 1;
		
		for(int i = 1 ; i <= 6 ; i++)
		{
			fact *= i;
		}
		System.out.println("Factorial of number " + n + " is : " + fact);
	}

}
