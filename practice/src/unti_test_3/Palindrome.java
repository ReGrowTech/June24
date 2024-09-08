package unti_test_3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
// //15.WAP to Check whether a number is Palindrome or not?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int dup = num;
		int ld;
		int rev = 0;
		
		while(num > 0)
		{
			ld = num % 10;
			num = num / 10;
			rev = (rev * 10) + ld;
		}
		System.out.println("Reverse of given number is : " + rev);
		
		if(rev == dup)
		{
			System.out.println("Yes..its a Palindrome");
		}
		else
		{
			System.out.println("No..its a Palindrome");
		}

	}

}
