package capsule_12_bySweety;

import java.util.Scanner;

public class Sum_the_no_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in );
		System.out.print(" enter a simple no  :");
		int n =sc.nextInt();
		int sum = 0;
		while (n>0)
		{
			int ld =n%10 ;
			n=n/10 ;
			sum =sum +ld ;
		}
		System.out.println(" Sum of all the digit are "+ sum);
	}

}
