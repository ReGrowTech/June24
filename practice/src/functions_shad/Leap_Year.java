package functions_shad;

public class Leap_Year {

// WAP to check whether a year is a leap year or not using Function.
	
	public static void main(String[] args) {
		
		int yr =  2000;
		
		Leap_Year lp = new Leap_Year();
		lp.checking_Leap(yr);
	}

	public void checking_Leap(int y)
	{
		if((y  % 100 == 0 ) && (y % 400 == 0))
		{
			System.out.println(y + " is a Leap Year");
		}
		
		else if((y % 4 == 0) && (y % 100 != 0))
		{
			System.out.println(y + " is a Leap Year");
		}
		else
		{
			System.out.println(y + " is not a Leap Year");
		}
	}
}
