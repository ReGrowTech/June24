package capsule8;
import java.util.*;
public class quetion1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("enter a year");
		
		int yr = sc.nextInt();

		if(yr%400==0 && yr %100==0)
		{
			System.out.println(yr+"its  a leap year");
		}
		
		else if(yr%4==0 && yr%100!=0)
		{
			System.out.println(yr+"its  a leap year");
		}
		else
		{
			System.out.println(yr+"its not a leap year");
}
	}
}

