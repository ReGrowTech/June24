package unit_test_01_shad;

public class Leap_Year_Nested {

	public static void main(String[] args) {
		
// Q9. WAP to print whether a year is a leap or not using nested If Else.

		int yr = 1900;
		
		if (yr % 100 == 0)
		{
			if (yr % 400 == 0)
			{
				System.out.println("Leap Year");
			}
			
			else
			{
				System.out.println("Not a Leap Year");
			}
		}
		
		else
		{
			if(yr % 4 == 0)
			{
				System.out.println("Leap Year");
			}
			
			else
			{
				System.out.println("Not a Leap Year");
			}
		}
		
		

	}

}
