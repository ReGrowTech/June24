package caps_13_shad;

public class Factorial_Of_6 {
	
	public static void main(String[] args) {
	
// 1. WAP to find the factorial of 6.
		
		int i = 1;
		int n = 6;
		int fact = 1;
		
		while(i <= n)
		{
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of number 6 is : "+ fact);

	}

}
