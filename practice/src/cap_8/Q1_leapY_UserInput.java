package cap_8;

import java.util.*;

public class Q1_leapY_UserInput 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Year");
      int year = sc.nextInt();
      if(year%100==0 && year%400==0)
      {
    	  System.out.println(year + ":is a Leap Year");
      }
      else if (year%4==0 && year%100!=0)
      {
    	  System.out.println(year + ":is a Leap Year");
      }
      else
      {
    	  System.out.println("is not a Leap Year");
      }
	}

}
