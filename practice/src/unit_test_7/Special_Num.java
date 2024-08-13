package unit_test_7;

public class Special_Num {

	public static void main(String[] args) {
		
//Q5. WAP to print special number between 10-200?
		
		System.out.println("Special number between 10-200 are ");
		
		for(int i = 10 ; i <=200 ; i++)
		{
			int n = i;
			int ld;
			int sum = 0;
			
			while(n > 0)
			{
				ld = n % 10;
				n = n / 10;
				
				int fact = 1;
				
				for(int j = 1 ; j <= ld ; j++)
				{
					fact = fact * j;
				}
				
				sum += fact;
			}
			
			if(sum == i)
			{
				System.out.println(i);
			}
		}
	}

}
