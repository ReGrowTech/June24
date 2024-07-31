package unitTest4;

public class Q4_LeapYear_only_if {
	public static void main(String args[])
	{
		int year = 2008;
		if(year%100==0 && year%400==0 || year%4==0 && year%100!=0)
		{
			System.out.println(year+":is a leap year");
		}
		else
		{
			System.out.println(year+":is not a leap year");
		}
	}
}
