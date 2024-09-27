package capsule_8_bySweety;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.print(" Enter a Year to check ");
		int yr =sc.nextInt();
		
		if((yr%100==0 && yr%400==0)|| (yr%100!=0 && yr%4==0))
		{
			System.out.println(" its a leap year "+ yr);
		}
		else 
		{
			System.out.println(" its not  leap year "+ yr);
		}
		
	}

}
