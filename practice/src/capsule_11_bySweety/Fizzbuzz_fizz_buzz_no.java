package capsule_11_bySweety;

import java.util.Scanner;

public class Fizzbuzz_fizz_buzz_no {

	public static void main(String[] args)
	{
		//Fizzbuzz_fizz_buzz_no
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a no to check : ");
		int n= sc.nextInt();
		
		if(n%3==0 &&  n%5==0)
		{
			 System.out.println(" its a FizzBuzz no");
		}
		else if(n%3==0 )
		{
			System.out.println(" its a Fizz no");

		}
		else if(n%5==0 )
		{
			System.out.println(" its a Buzz no");
		}
		else
		{
			System.out.println(" its nither a  Fizz no , Buzz no , FizzBuzz no");
		}
		
	}

}
