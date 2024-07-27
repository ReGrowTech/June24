package unti_test_3;

import java.util.Scanner;

public class Divisible_by_11 {

	public static void main(String[] args) {
		
		
// Q9. WAP to check whether the number is divisible by 11 or not. Take User input.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		if(n % 11 == 0)
		{
			System.out.println(n + " is divible by 11");
		}
		else
		{
			System.out.println(n + " is not divible by 11");
		}

	}

}
