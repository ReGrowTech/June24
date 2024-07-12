package while_loop;

public class Palindrome {

	public static void main(String[] args) {
		
		int n = 141;
		int ld;
		int rev = 0;
		int n2 = n;
		
		while(n != 0)
		{
			
			ld = n % 10;
			n = n / 10;
			rev = (rev * 10)+ld;  
		}
		
		if(n2 == rev)
		{
			System.out.println(
					"Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
