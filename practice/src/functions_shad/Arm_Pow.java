package functions_shad;

public class Arm_Pow {

	public static void pow(int cnt ,int n) {
	
		int n2 = n;
		int ld;
		int sum = 0;
		
		
		while(n > 0)
		{
			ld = n % 10;
			n = n /10;
			
			int pow = 1;
			
			for(int i = 1 ; i <= cnt ; i++)
			{
				pow = pow * ld;
			}
			
			sum = sum + pow;
		}
		
		Arm_Pow.check(n2,sum); // calling check method
	}
	
	public static void check(int n2 , int sum)
	{
		if(sum == n2)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an Armstrong");
		}
	}

	
}
