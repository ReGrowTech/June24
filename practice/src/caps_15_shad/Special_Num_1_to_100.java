package caps_15_shad;

public class Special_Num_1_to_100 {

	public static void main(String[] args) {
		
//Q6. WAP to print all the special number between 1-200 using for loop.
		
		for(int a = 1 ; a <= 200 ; a++)
		{
			int n = a;
			int ld = 0;
			int sum = 0;
			
			while(n > 0)
			{
				ld = n % 10;
				n = n / 10;
				
				int fact = 1;
				
				for(int i = 1 ; i <= ld ; i++)
				{
					fact = fact * i;
				}
				
				sum = sum + fact;
			}
			
			if(sum == a)
			{
				System.out.println(a + " is a Special number");
			}
			
		}

	}

}
