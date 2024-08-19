package unit_test_03_shad;

import java.util.*;

public class Leap_Year {

	public static void main(String[] args) {
	
// Q10.WAP to find the Leap Year of a number. Take User input.
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any year");
		int yr = sc.nextInt();
		
		if(yr % 100 == 0 && yr % 400 == 0)
		{
			System.out.println(yr + " is a Leap year");
		}
		else if(yr % 100 != 0 && yr % 4 == 0 )
		{
			System.out.println(yr + " is a Leap year");
		}
		else
		{
			System.out.println(yr + " is not a Leap year");
		}
		

	}

}
