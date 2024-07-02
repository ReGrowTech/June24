package capsules;

public class Leap_Year_If_Else {

	public static void main(String[] args) {

// Write a program to find the leap year using if else.
		
		int yr = 2024;
		
		if (( yr % 100 == 0  &&   yr % 400 == 0 ) || (yr % 100 != 0  &&  yr % 4 == 0  ))
		{
			System.out.println("Its a Leap Year");
		}

		
		else
		{
			System.out.println("Its not a Leap Year");
		}
	}

}
