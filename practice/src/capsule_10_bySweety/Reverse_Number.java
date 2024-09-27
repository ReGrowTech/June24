package capsule_10_bySweety;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.print("enter a simple no  :  ");
		int n= sc.nextInt (); //145
		
		int rev=0;
		
		while(n>0)
		{
			int last_dig = n%10;// last digit 5
			n =n/10;  // 14
			rev=(rev*10)+last_dig;
			
			
		}
		System.out.println(rev);
	}

}
