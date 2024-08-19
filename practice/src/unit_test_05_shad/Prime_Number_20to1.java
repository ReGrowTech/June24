package unit_test_05_shad;

public class Prime_Number_20to1 {

	public static void main(String[] args) {
		
// Q8. Write a program to find the Prime numbers between 20-1 using for loop. 
		
		int a = 1;
	
		System.out.println("Prime numbers between 20-1 are");
		
		for(int i = 20 ; a <= i ; i--)
		{
			int cnt = 0;
			
			for(int j = 1 ; j <= i ; j++)
			{
				if(i % j == 0)
				{
					cnt++;
				}
				
			}
			
			if(cnt == 2)
			{
				System.out.println(i);
			}	
		}

	}

}
