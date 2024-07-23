package unit_test_4;

public class Amstrong_Number {

	public static void main(String[] args) {
	
// Q15. Write a program to check whether the number is an Armstrong number or not. 
		
		int n = 371;
		int n2 = n;
		int n3 = n;
		int cnt = 0;
		
		while(n > 0)
		{
			n = n / 10;
			cnt++;
		}
		
		int ld ;
		int sum = 0;
		
		while(n2 > 0)
		{
			 ld = n2 % 10;
			 n2 = n2 / 10;
			 
			 int pow = (int)Math.pow(ld, cnt);
			 
			 sum = sum  + pow;
			 
		}
		
		if(n3 == sum)
		{
			System.out.println(n3 + " is an Armstrong number");
		}
		else
		{
			System.out.println(n3 + " is not an Armstrong number");
		}
	}

}
