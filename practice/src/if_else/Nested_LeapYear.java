package if_else;

public class Nested_LeapYear {
	public static void main(String args[])
	{
	  int year = 1900;
          if(year%100==0)
	{
	if(year%400==0)
	{
	System.out.println(year + " : is a leap year");
	}
	else
	{
	System.out.println(year + " : is not a leap year");
	}
	}
	else
	{
	if(year%4==0)
	{
	if(year%100!=0)
	{
	System.out.println(year + " : is a leap year");
	}
	else
	{
	System.out.println(year + " : is not a leap year");
	}
	}
	}
	}
	}
