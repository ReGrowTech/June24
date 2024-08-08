package unit_test_6;

public class Armstrong {

	public static void main(String[] args) {
	
//Q5. WAP to check whether the no, is Armstrong or not?
		
		int n = 371;
		int n2 = n;
		int n3 = n;
		int cnt = 0;
		
		while(n2 > 0 )
		{
			n2 = n2 / 10;
			cnt++;
		}
		
		int ld;
		int sum = 0;
		
		while(n3 > 0)
		{
			ld = n3 % 10;
			n3 = n3 / 10;
			
			int fact = 1;
			
			for(int i = 1 ; i <=cnt ; i++)
			{
				fact = fact * ld;
			}
			
			sum = sum + fact;
		}
		
		if(n == sum)
		{
			System.out.println(n + " is an Armstrong");
		}
		else
		{
			System.out.println(n + " is not an Armstrong");
		}
		

	}

}
