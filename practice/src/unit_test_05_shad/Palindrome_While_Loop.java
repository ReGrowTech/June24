package unit_test_05_shad;

public class Palindrome_While_Loop {

	public static void main(String[] args) {
	
// Q6. Write a program in Java to check if a number is Palindrome using a while loop. 
		
		int n = 171;
		int n2 = n;
		int ld;
		int rev = 0;
		
		while(n > 0)
		{
			ld = n % 10;
			n = n / 10;
			rev = (rev * 10) + ld;
		}
		if(rev == n2)
		{
			System.out.println(n2 + " is a Palindrome");
		}
		else
		{
			System.out.println(n2 + " is not a Palindrome");
		}
	}

}
