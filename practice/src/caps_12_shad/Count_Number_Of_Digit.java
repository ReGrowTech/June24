package caps_12_shad;

import java.util.*;

public class Count_Number_Of_Digit {
	
//2. WAP to Count the no of digits.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int a = sc.nextInt();
		int count = 0;
		
		while(a>0)
		{
			a = a/10;
			count++;
		}
		System.out.println("Total number of digit : " + count);
	}

}
