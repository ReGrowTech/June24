package caps_XIII;

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
	
//4. WAP to Check whether the number is Palindrome or not.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int num2 = num;
		int ld;
		int rev = 0;
		
		while(num>0)
		{
			ld = num % 10;
			num = num / 10;
			rev = (rev * 10)+ld;
		}
		
		System.out.println("Reverse of given number is : " +rev);
		
		if(rev == num2)
		{
			System.out.println(num2 + " is a Palindrome");
		}
		else
		{
			System.out.println(num2 + " is not a Palindrome");
		}
	}

}
