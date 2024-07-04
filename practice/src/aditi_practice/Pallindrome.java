package aditi_practice;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int n1 = num;	
		int rev = 0;
		
		while(num > 0) {
			int ld = num % 10;
			num = num / 10;
			
			rev = (rev * 10) + ld;
		}
		
		if(n1 == rev) {
			System.out.println("The number is pallindrome");
		}
		else {
			System.out.println("The no is not pallindrome");
		}

	}

}
