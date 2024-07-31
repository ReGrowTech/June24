package unitTest3;

public class Q15_Palindrome {

	public static void main(String[] args) {
		int n = 1441;
		int ld;
		int rev = 0;
		int n2 = n;
		
		while(n!=0)
		{
			ld = n%10 ;
			n = n/10;
			rev = (rev*10)+ld;
		}
		if(n2==rev)
		{
			System.out.println(n2 +":is a palindrome number");
		}
		else
		{
			System.out.println(n2 +":is not a palindrome number");
		}
	}

}
