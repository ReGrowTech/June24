package armstrong;

import java.util.Scanner;

public class Armstrong_Without_MathFunction {

	public static void main(String[] args) {

// WAP to check whether the number is Armstrong Number or not without using Math.pow function.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int a = sc.nextInt();		
		
		int b = a;
		int c = a;
		int count = 0;
		
		while( a > 0)
		{
			a = a / 10;
			count++;
		}
		System.out.println("Count of digit : "+ count);
		
		int ld;
		int sum = 0 ;
		
		while(b > 0)
		{
			ld = b % 10;
			b = b /10;
		
			int i = 1;
			int pow = 1;
			
			while(i <= count)
			{
				pow = pow * ld;
				i++;
			}
			
			sum = sum + pow; 
			
		}
		System.out.println("The sum of number : " + sum);
		
		if(sum == c)
		{
			System.out.println(c +" : Its an Armstrong number");
		}
		else
		{
			System.out.println(c + " : Its not an Armstrong number");
		}
		
	}

}
