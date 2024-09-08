package caps_XII;

import java.util.*;

public class Sum_Of_Digit {

//3. WAP to sum the no of digits.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number ");
		int n = sc.nextInt();
		
		int ld;
		int sum = 0;
		
		while(n>0)
		{
			ld = n % 10;
			n = n / 10;
			
			sum = sum + ld;
		}
		
		System.out.println("The sum of given number : " + sum);
	}

}
