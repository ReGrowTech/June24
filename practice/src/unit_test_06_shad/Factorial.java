package unit_test_06_shad;

public class Factorial {

	public static void main(String[] args) {
		
//Q2. WAP in Java to print the factorial of a given number.
		
		int n = 6;
		int fact = 1;
		
		for(int i = 1 ; i <= n  ; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of number " + n + " is : " + fact);

	}

}
