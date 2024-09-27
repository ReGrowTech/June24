package capsule_6_bySweety;

import java.util.Scanner;

public class Greatest_2_Ternary_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter 2 numbers : ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		int res =(a>b)? a: b;
		
		System.out.println("Greate no : "+res);
	}

}
