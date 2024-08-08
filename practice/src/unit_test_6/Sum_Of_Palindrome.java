package unit_test_6;

public class Sum_Of_Palindrome {

	public static void main(String[] args) {
		
//Q7. WAP to find the sum of all Palindrome numbers between 2-24?
		
		int sum = 0;
		
		for(int i = 2 ; i <= 24 ; i++)
		{
			int num = i;
			int ld;
			int rev = 0;
			
			while(num > 0)
			{
				ld = num % 10;
				num = num / 10;
				rev = (rev * 10) + ld;
			}
			
			if(i == rev)
			{
				sum = sum + i;
			}
		}
		
		System.out.println("Sum of all Palindrome numbers are : " + sum);
		
	}

}
