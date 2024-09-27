package capsule_10_bySweety;

import java.util.Scanner;

public class Palindrom_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.print("enter a simple no  :  ");
		int orig_n= sc.nextInt (); //145
		
		int n= orig_n ;    
		int rev=0;
		 
		
		while(n>0)
		{
			int last_dig = n%10;// last digit 5
			n =n/10;  // 14
			rev=(rev*10)+last_dig;
			
		}
		
		if(orig_n ==rev)
		{
			System.out.println("Palindrome no ");
		}
		else
		{
			System.out.println(" not a Palindrome no ");
		}
	}

}
