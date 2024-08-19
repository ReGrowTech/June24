package unit_test_04_shad;

public class Leap_Year {

	public static void main(String[] args) {
		
// Q4.WAP to check whether a year is a leap year or not using only if else. (no use of else if). 
		int y = 2020;
		
		if(y % 100 == 0)
		{
			if(y % 400 == 0)
			{
				System.out.println(y + " is a Leap Year");
			}
			else
			{
				System.out.println(y + " is not a Leap Year");
			}
		}
		
		else
		{
			if(y % 4 == 0)
			{
				System.out.println(y + " is a Leap Year");
			}
			else
			{
				System.out.println(y + " is not a Leap Year");
			}
		}

	}

}
