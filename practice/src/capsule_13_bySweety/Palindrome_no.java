package capsule_13_bySweety;

import java.util.Scanner;

public class Palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//palindrome_no 
		/*
		 * take a no 
		 * find last digits  and store it 
		 * and continue to find the last digit 
		 * and then reverse it 
		 * and then compare the no 
		 */
		Scanner sc= new Scanner (System.in);
		System.out.print(" enter a simple no ");
		int n =sc.nextInt();
		int n_orig =n ;
		int rev =0 ;
		while(n>0)
		{
		 int ld = n%10;
		 n =n/10 ;
		 rev = (rev*10)+ld;
		}
		if(rev==n_orig)
		{
			System.out.println(" Its a palindrome no "+ n_orig);
		}
		else
		{
			System.out.println(" Its not  palindrome no "+ n_orig);
		}
		
		
	}

}
