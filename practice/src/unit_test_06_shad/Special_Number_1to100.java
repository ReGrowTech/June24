package unit_test_06_shad;

public class Special_Number_1to100 {

	public static void main(String[] args) {
		
//Q11.WAP to print special number between 1-100?
		
		System.out.println("Special number between 1-100 are ");
		
		for(int i = 1 ; i <= 100 ; i++)
		{
			int ld;
			int sum = 0;
			
			for(int temp = i ; temp > 0 ; temp = temp / 10)
			{
				ld = temp % 10;
				
				int fact = 1 ;
				
				for(int j = 1 ; j <=ld ; j++)
				{
					fact = fact * j;
				}
				
				sum = sum + fact ;
			}
			
			if(sum == i)
			{
				System.out.println(i);
			}
		}

	}

}
