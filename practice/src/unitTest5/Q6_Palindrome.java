package unitTest5;

public class Q6_Palindrome {

	public static void main(String[] args) {
		int n = 1991;
		int ld = 0;
		int rev = 0;
		int n1 = n;
		
		while(n>0)
		{
			ld = n%10;
			n = n/10;
			rev = (rev*10)+ld;
		}

		if(rev==n1)
		{
			System.out.println(n1 + " : is a palindrome number");
		}
		else
		{
			System.out.println(n1 + " : is not a palindrome number");
		}
	}

}
