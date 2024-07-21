package cap_VIII;
import java.util.*;

public class Leap_Year_User_Input {

	public static void main(String[] args) {
		
// Write a program to find a year is a leap year or not. Take input from the user. 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year : ");
		int yr = sc.nextInt();
		
		if(yr % 100 == 0 && yr % 400 == 0)
		{
			System.out.println("Its a Leap Year");
		}
		
		else if(yr % 100 !=0 && yr % 4 == 0)
		{
			System.out.println("Its a Leap Year");
		}
		
		else
		{
			System.out.println("Its not a Leap Year");
		}
		
				
	}

}
