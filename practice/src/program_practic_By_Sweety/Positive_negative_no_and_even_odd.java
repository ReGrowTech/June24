package program_practic_By_Sweety;

import java.util.*;

public class Positive_negative_no_and_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.print("Enter  a number to check  ");
		int n= sc.nextInt ();
		
		
		if(n>0)
		{ 
			System.out.println(" It a Positive no ");
			if(n%2==0)
			{
				System.out.println(" Positive Even no   ");
			}
			else
			{
				System.out.println(" Positive Odd no   ");
			}
		}
		else if(n<0)
		{
			System.out.println(" It a Negatives no ");	
			if(n%2==0)
			{
				System.out.println(" Negatives Even no   ");
			}
			else
			{
				System.out.println(" Negatives Odd no   ");
			}
		}
		else
		{
			System.out.println(" Unvalid user input   ");
		}
		sc.close();
	}

}
