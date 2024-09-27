package capsule_6_bySweety;

import java.util.Scanner;

public class Smallest0f3_userinput_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter 3 numbers : ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		if(a<b && a<c ) 
		{
			System.out.println(" smallest number  :" +a );
		}
		else if(b<c)
		{
			System.out.println(" smallest number  :" +b );
		}
		else
		{
			System.out.println(" smallest number  :" +c );
		}
	}

}
