package cap_7;

public class Q1_LeapY_ifelse {

	public static void main(String[] args) {
		int year = 1900;
		  if(year%100==0 && year%400==0)
		{
		System.out.println(year + ":is a leap year");
		}
		else if
		(year%4==0 && year%100!=0)
		{
		System.out.println(year + ":is a leap year");
		}
		else
		{
		System.out.println(year + ":is not a leap year");
		}
	}

	}


