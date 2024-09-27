package capsule_5_bySweety;

public class Leap_year_using_if_else {

	public static void main(String[] args) {
		/*
		 To be a leap year 
		 year must be divisible  4
		 //except for century year %100
		  // then it should be divisible by 400
		 */
		
		int yr =2018;
		
		if((yr%100==0 && yr%400==0 )&& (yr%100!=0 && yr%4==0))
		{
			System.out.println(" its a leap year ");
		}
		else
		{
			System.out.println(" its not a  leap year ");
		}
		
	}

}
