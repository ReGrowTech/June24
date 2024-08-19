package unit_test_08_shad;

public class Armstrong_For {

	public static void main(String[] args) {
		
//Q3. WAP to check whether a number is Armstrong or not using for loop.
		
		int n = 371;
		int cnt = 0;
		
		for(int n2 = n ; n2 > 0 ; n2 = n2 / 10)
		{
			cnt++;
		}

		int ld;
		int sum = 0;
		
		for(int n3 = n ; n3 > 0 ; n3 = n3 / 10)
		{
			ld = n3 % 10;
			
			int pow = 1;
			
			for(int i = 1 ; i <= cnt ; i++)
			{
				pow = pow * ld; 
			}
			
			sum += pow;
		}
		
		if(sum == n)
		{
			System.out.println(n + " is an Armstrong");
		}
		else
		{
			System.out.println(n + " is not an Armstrong");
		}
		
	}

}
