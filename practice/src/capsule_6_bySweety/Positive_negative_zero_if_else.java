package capsule_6_bySweety;

import java.util.Scanner;

public class Positive_negative_zero_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter a numbers : ");
		int n =sc.nextInt();
		if(n==0)
		{
			System.out.println(" its a zero ");
		}
		else if (n>0)
		{
			System.out.println(" its a positive no  ");
		}
		else
		{
			System.out.println(" its a negative no  ");
		}
	}

}
