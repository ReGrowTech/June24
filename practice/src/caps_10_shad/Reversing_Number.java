package caps_10_shad;

import java.util.*;

public class Reversing_Number {

	public static void main(String[] args) {
	
// 1. WAP to to print the reverse of a number. take input from the user.  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number that you want to reverse");
		int num = sc.nextInt();
		
		int ld;
		int rev = 0;
		
		while(num !=0)
		{
			ld = num % 10;
			num = num / 10;
			rev = (rev * 10) + ld;
		}
		System.out.println(rev);
	}

}
