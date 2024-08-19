package unit_test_03_shad;

import java.util.*;

public class Min_3_Num_Ternary {

	public static void main(String[] args) {
		
// 8. WAP to find the minimum of 3 numbers using Ternary Operator. Take Input from the user?
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd number");
		int c = sc.nextInt();
		
		int res = (a < b && a < c)? a: (b < c)? b:c;
		System.out.println("The minimum number is " + res);
	}

}
