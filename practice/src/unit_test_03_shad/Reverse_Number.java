package unit_test_03_shad;

import java.util.*;

public class Reverse_Number {

	public static void main(String[] args) {
		
// Q14.WAP to reverse the number. Take input from the user. 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int ld;
		int rev = 0;
		
		while(num > 0)
		{
			ld = num % 10;
			num = num / 10;
			rev = (rev * 10) + ld;
		}
		System.out.println("Reverse of given number is : " + rev);
		

	}

}
