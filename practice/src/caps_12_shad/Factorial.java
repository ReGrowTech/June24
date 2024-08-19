package caps_12_shad;

import java.util.*;
public class Factorial {
	
//1. WAP to Find the factorial of a number.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for factorial");
		int n = sc.nextInt();
		
		int i = 1;
		int fact = 1;
		
		while(i <= n)
		{
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of number " + n + " is " + fact);
	}

}
