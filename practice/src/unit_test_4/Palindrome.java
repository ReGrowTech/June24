package unit_test_4;

public class Palindrome {

	public static void main(String[] args) {
		
// Q8. Write a program to check whether the number is Palindrome or not.
		
		int m = 151;
		int m2 = m;
		int ld;
		int rev = 0;
		
		while(m > 0)
		{
			ld = m % 10;
			m = m / 10 ;
			rev = (rev * 10) + ld;
		}
		System.out.println("The reversed number is : " + rev);
		
		if(rev == m2)
		{
			System.out.println(m2 + " is a Palindrome");
		}
		else
		{
			System.out.println(m2 + " is not a Palindrome");
		}

	}

}
