package caps_XIII;

import java.util.*;
public class First_Digit {

	public static void main(String[] args) {
	
//7.WAP to find the 1st digit of the number. (number should be initialize by the user).

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int ld = 0;
		
		while(num>0)
		{
			ld = num % 10;
			num = num /10;
		}
		System.out.println("The 1st digit of given number is : " + ld);
	}

}
