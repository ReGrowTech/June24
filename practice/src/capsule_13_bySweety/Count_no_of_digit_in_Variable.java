package capsule_13_bySweety;

import java.util.Scanner;

public class Count_no_of_digit_in_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter a simple no : ");
		int n= sc.nextInt();
		int count=0 ;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(" Count of the digit present in the number : "+count);
	}

}
