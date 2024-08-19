package caps_14_shad;

public class For_Loop_Factorial {

	public static void main(String[] args) {
		
//Q9. WAP to find the factorial of a number using for loop.
		
		int n = 6;
		int fact = 1;
		
		for(int i = 1; i<=n ; i++)
		{
			fact = fact * i;	
		}
		System.out.println("Factorial of " + n + " is : " + fact);
	}

}
