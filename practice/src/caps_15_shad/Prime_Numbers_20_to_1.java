package caps_15_shad;

public class Prime_Numbers_20_to_1 {

	public static void main(String[] args) {
		
//Q5. WAP to print all the prime numbers between 20-1 using for loop.
		
		int n = 1;
		
		System.out.println("Prime numbers are");
		
		for(int i = 20 ; n <= i ; i--) 
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
