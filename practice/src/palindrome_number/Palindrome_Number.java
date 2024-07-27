package palindrome_number;

public class Palindrome_Number 
{
	public static void main(String args[])
	{
		int n = 141;
		int ld;
		int rev = 0;
		int n1 = n;
		
		while(n>0) //(n!=0) is the same thing.
		{
			ld = n%10;
			n = n/10;
			rev= (rev*10)+ld;	
		}
		
		if(n1==rev)
		{
			System.out.println("is a palindrome number");
		}
		else
		{
			System.out.println("is not a palindrome");
		}
	}
}
