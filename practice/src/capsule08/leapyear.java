
package capsule08;
import java.util.*;
public class leapyear {
public static void maain (String[]args){

	Scanner sc = new Scanner (System.in);
	System.out.println("enter a year");
	
	int yr = sc.nextInt();
boolean isleapyear= false;
	if(yr%400==0 && yr %100==0)
	{
		System.out.println(yr+"its  a leap year");
	}
	isleapyear = true;
//	else if(yr%4==0 && yr%100!=0)
//	{
//		System.out.println(yr+"its  a leap year");
//	}
//	else
//	{
//		System.out.println(yr+"its not a leap year");
//	}






}
}