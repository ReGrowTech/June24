package programing_Capsules_sweety;

import java.util.Scanner;

public class Leap_year_nested_if_Important_Qn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// A leap year is a year that is exactly divisible by 4
// except for the century year (year ending with 00)
// the century year is a leap year only if it is perfectly divisible by 400
        // year%4==0		
		// year%100==0
		// year%400==0	
		boolean leap=false;
		Scanner sc =new Scanner(System.in);
         System.out.println(" enter a year to check  :  ");
         int year= sc.nextInt();
		
		if(year%4==0)
		{
		 	if(year %100==0) 
		 	{
		 		if(year %400==0) 
		 		  {
		 			leap=true;
		 		   }
		 		else
		 		{
		 			leap=false;
		 		}
		 		 leap=true;
		 	}
		}
		else
		{
			leap=false; 
		}
		System.out.println(year +" is a leap year ? "+ leap);
		 
		
		
	}

}
