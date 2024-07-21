package caps_IX;

import java.util.*;

public class Divisible_By_3 {

	public static void main(String[] args) {
		
// 3. WAP to print all the numbers divisible by 3 between 1 to N. Take N as input from the user.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N no. of value :");
		int div = sc.nextInt();
		int m = 1;
		
		
		while(m <= div)
		{
			if(m % 3 == 0)
			{
				System.out.println(m);
			}
			m++;
		}
		
	}

}
