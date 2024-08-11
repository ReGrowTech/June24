package program_practic_By_Sweety;

import java.util.*;

public class Voting_eligibility_of_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.print("Enter  age  to check eligibility to vote   ");
		int p1 = sc.nextInt ();
		
		if(p1>18)
		{
			System.out.println(" Yes you are eligible to vote ");
		}
		else
		{
			System.out.println(" Sory  you are not eligible to vote ");
		}
		
		System.out.println("------------------------------------------");
		System.out.println();
		
		System.out.print("Enter  age  to check eligibility to vote   ");
		int p2 = sc.nextInt ();
		
		if(p2>18)
		{
			System.out.println(" Yes you are eligible to vote ");
		}
		else
		{
			System.out.println(" Sory  you are not eligible to vote ");
		}
		
		System.out.println("------------------------------------------");
		System.out.println();
		
		System.out.print("Enter  age  to check eligibility to vote   ");
		int p3 = sc.nextInt ();
		
		if(p3>18)
		{
			System.out.println(" Yes you are eligible to vote ");
		}
		else
		{
			System.out.println(" Sory  you are not eligible to vote ");
		}
		
		System.out.println("------------------------------------------");
		System.out.println();
		
		
		
        sc.close();
		
	}

}
