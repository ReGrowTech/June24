package unitTest3;

import java.util.Scanner;

public class Q8_MinNo_Ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your 1st value");
		int a = sc.nextInt();
		System.out.println("Enter your 2nd value");
		int b = sc.nextInt();
		System.out.println("Enter your 3rd value");
		int c = sc.nextInt();
		
		int result = (a<b && a<c)? a : (b<c)? b: c;
		System.out.println(result);
	}

}
