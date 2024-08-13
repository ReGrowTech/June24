package unit_test_7;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
//Q6. WAP to print Fibonacci Series up to nth terms?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nth value for Fibonacci series");
		int lt_term = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i = 1 ; i <= lt_term - 2 ; i++)
		{
			int c = a + b;
			System.out.print(c + " ");
			
			a = b;
			b = c;
		}
		

	}

}
