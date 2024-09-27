package capsule_6_bySweety;

public class Leap_year_if_Else_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         int yr =2020;
		
		if(yr%100==0 && yr%400==0 ) 
		{
			System.out.println(" its a leap year ");
		}
		else if (yr%100!=0 && yr%4==0)
		{
			System.out.println(" its a leap year ");
		}
		else
		{
			System.out.println(" its not a  leap year ");
		}
	}

}
