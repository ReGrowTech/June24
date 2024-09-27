package capsule_12_bySweety;

import java.util.Scanner;

public class Special_no_Krishnamurti_no {

	public static void main(String[] args) {
		/*
		 * What is krishnamurti no 
		  145 = 1! + 4! +5! 
		  145 = 1 +24 +120 
		  145 =145 
	
	     // last digit 
	     // last digit factorial 
	     // save that digit factorial in sum 
	     // and check if the sum value is equal to the user value 
		 */

		Scanner sc = new Scanner (System.in );
		System.out.print(" enter a simple no  :");
		int orig_n =sc.nextInt(); // 145 
		int n =orig_n ;
		
		int ld ;
		int sum =0 ;
	
		while(n>0)
		{
			ld =n%10 ;// last digit value stored of which we have to do Factorial 
			n=n/10 ;
			//Factorial of every digit 
			int str =0; // start value 
			int fact = 1 ;
			while(str <= ld )
			{
				fact =fact * str ;
				str++ ;
			}
			sum =sum+fact ;
		}
		if(sum==n)
		{
			System.out.println(" this is a Krishnamurti no ");
		}
		else
		{
			System.out.println(" this is not a Krishnamurti no ");
		}

	}

}
//40585 Krishnamurti no 
