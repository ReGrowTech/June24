package capsule_8_bySweety;

import java.util.Scanner;

public class Greatest_of3_no_ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("enter 3 numbers : --");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int Result =(a>b && a>c)? a:(b>c)? b:c ;
		System.out.println(Result +" it is the maximum of three numbers ");

	}

}
