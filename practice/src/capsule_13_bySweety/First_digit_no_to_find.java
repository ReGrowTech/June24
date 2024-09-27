package capsule_13_bySweety;

import java.util.Scanner;

public class First_digit_no_to_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a simple no ");
		int n =sc.nextInt();
		int ld =0;
		
		while(n>0)
			{
				// last digit 
				
			     ld =n%10 ;
			     n = n/10;
				
			}
		System.out.println(ld);
	}

}
