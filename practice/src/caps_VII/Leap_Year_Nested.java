package caps_VII;

public class Leap_Year_Nested {

	public static void main(String[] args) {
		
// Write a program to find the leap year using nested if-else. 
		
		int yr = 1900;
		
		if (yr % 100 == 0)
		{
			if (yr % 400 == 0)
			{
				System.out.println("Its a Leap Year");
			}
			
			else
			{
				System.out.println("Its not a Leap Year");
			}
		}
		
		else
		{
			if(yr % 4 == 0)
			{
				System.out.println("Its a Leap Year");
			}
			
			else
			{
				System.out.println("Its not a Leap Year");
			}
		}
				
	}

}
