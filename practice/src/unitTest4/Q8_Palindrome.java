package unitTest4;

public class Q8_Palindrome {

	public static void main(String[] args) {
		int n =131;
		int n1 = n;
		int ld =0;
		int rev =0;
		
		while(n>0)
		{
			ld = n%10;
			n =n/10;
			rev = (rev*10)+ld;
		}
		if(rev==n1)
		{
			System.out.println(n1+":is a Palindrome Number");
		}
		else
			{
				System.out.println(n1+":is not a Palindrome Number");
			}
		}
	}


