package cap_10;

import java.util.Scanner;

public class Q4_Palindrome_UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter palindromic value here");
		int n = sc.nextInt();
		int ld;
		int rev = 0;
		int n1 = n;
		
		while(n>0)
		{
			ld = n%10;
			n = n/10;
			rev = (rev*10)+ld;
		}
		
		if(n1==rev)
		{
			System.out.println("is a palindrome number");
		}
		else
		{
			System.out.println("is not a palindrome number");
		}
	}

}
