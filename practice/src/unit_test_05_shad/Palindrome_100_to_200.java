package unit_test_05_shad;

public class Palindrome_100_to_200 {

	public static void main(String[] args) {
		
// Q9.Write a program to find the Palindrome numbers between 100 to 200. 		
		
		int i = 200;
		
		System.out.println("Palindrome numbers between 100-200 are");
		
		for(int n = 100 ; n <= i ; n++)
		{
			int n2 = n;
			int ld;
			int rev = 0;
			
			while(n2 > 0)
			{
				ld = n2 % 10;
				n2 = n2 /10;
				rev = (rev * 10) + ld;
			}
			
			if(n == rev)
			{
				System.out.println(n);
			}
		}
	}

}
