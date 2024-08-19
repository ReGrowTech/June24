package caps_15_shad;

public class For_Factorial_3to10 {

	public static void main(String[] args) {
		
//Q4. WAP to print all the factorial of a number between 3-10.
		
		int b = 10;
		
		for(int a = 3 ; a <= b ; a++)
		{
			int fact = 1;
			
			for(int i = 1 ; i <= a ; i++)
			{
				fact = fact * i;
			}
			System.out.println("Factorial of number " + a + " is : " +fact);
		}
	}

}
