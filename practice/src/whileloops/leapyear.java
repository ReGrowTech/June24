package whileloops;
import java.util.*;
public class leapyear {
public static void main(String[]args) {
	
Scanner sc = new Scanner (System.in);
System.out.println("enter the year");
int yr = sc.nextInt();
if(yr%100==0)
{
	if(yr%400==0)
	{
		System.out.println("its a leap year");
	}
	else 
	{
		System.out.println("its aleap year");
	}
}
 else if(yr%4==0 && yr%100!=0)
     {
	 System.out.println("its a leap year");
     }
 else
{
 System.out.println("its a not leap year");
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
