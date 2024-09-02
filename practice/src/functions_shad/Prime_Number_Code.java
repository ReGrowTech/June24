package functions_shad;

public class Prime_Number_Code {

// Code for prime numbers.
	
	public static void Prime_Code (int n) {
		
		int cnt = 0;
		
		for(int i = 1 ; i <= n ; i++)
		{
			if(n % i == 0)
			{
				cnt ++;
			}
		}
		
		if(cnt == 2)
		{
			System.out.println(n);
		}
		
		
	

	}

}
