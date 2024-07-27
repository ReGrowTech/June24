package armstrong;

import java.util.*;
public class Armstrong_Number {

	public static void main(String[] args) {
		
		
// WAP to check whether the number is Armstrong Number or not.
				
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter any number");
		int num = sc.nextInt();
				
		int num2 = num;
		int num3 = num;
		int count = 0;
				
		while(num > 0)
		{
			num = num / 10;
			count++;
		}
		
		System.out.println("Count of digit : " + count);
				
		int ld;
		int sum = 0;
				
		while(num2 > 0)
		{
			ld = num2 % 10;
			num2 = num2 / 10;
				
			int pow = (int)Math.pow(ld, count);
					
			sum = sum + pow;
		}
				
				
		System.out.println("sum of number : " + sum);
			
		if(sum == num3)
		{
			System.out.println(num3 +" : Its an Armstrong number");
		}
		else
		{
			System.out.println(num3 + " : Its not an Armstrong number");
		}
			

		}

	}


