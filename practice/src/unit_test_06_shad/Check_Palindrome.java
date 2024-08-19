package unit_test_06_shad;

public class Check_Palindrome {

	public static void main(String[] args) {
		
//Q1. WAP in Java to check if a number is a Palindrome using a while loop.		
		
		int n = 121;
		int m = n;
		int ld;
		int rev = 0;
		
		while(n>0)
		{
			ld = n % 10;
			n = n / 10;
			rev = (rev * 10)+ ld;
		}
		
		if(m == rev)
		{
			System.out.println(m + " is a Palindrome");
		}
		else
		{
			System.out.println(m + " is not a Palindrome");
		}
		

	}

}
