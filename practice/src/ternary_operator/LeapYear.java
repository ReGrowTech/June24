package ternary_operator;

public class LeapYear {
	public static void main(String args[])
	{
	  int year = 1990;
	 String res = (year%100==0 && year%400==0)||(year%4==0 && year%100!=0)?
	 "is a leap year":"is not leap year";
	System.out.println(res);
	  }
	}


