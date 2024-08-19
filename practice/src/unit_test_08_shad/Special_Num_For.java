package unit_test_08_shad;

public class Special_Num_For {

	public static void main(String[] args) {
	
//Q2. WAP to check whether a number is Special number or not using for loop.
		
		int n = 145;
		int ld;
		int sum = 0;
		
		for(int n2 = n ; n2 > 0 ; n2 = n2 / 10)
		{
			ld = n2 % 10;
			
			int fact = 1;
			
			for(int i = 1; i <= ld ; i++)
			{
				fact = fact * i;	
			}
			sum = sum + fact;
			
		}
		
		if(n == sum)
		{
			System.out.println(n + " is a Special number");
		}
		else
		{
			System.out.println(n + " is not a Special number");
		}
	}

}
