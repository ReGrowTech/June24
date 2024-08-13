package unit_test_7;

public class Armstrong {

	public static void main(String[] args) {
		
//Q8. WAP to check if the number is Armstrong Number or not.
		
		int n = 370;
		int n2 = n;
		int n3 = n;
		int ld;
		int sum = 0;
		int cnt = 0;
		
		while(n > 0)
		{
			n = n / 10;
			cnt ++;
		}
		
		while(n2 > 0)
		{
			ld = n2 % 10;
			n2 = n2 / 10;
			
			int pow = 1;
			
			for(int i = 1 ; i <=cnt ; i++)
			{
				pow = pow * ld;
			}
			
			sum = sum + pow;
		}
		
		if(sum == n3)
		{
			System.out.println(n3 + " is an Armstrong Number");
		}
		else
		{
			System.out.println(n3 + " is not an Armstrong Number");
		}

	}

}
