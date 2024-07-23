package unit_test_4;

public class Sum_Of_Natural_Num {

	public static void main(String[] args) {
		
// Q13.Write a program to find the sum of first 5 natural numbers. 
		
		int a = 1;
		int b = 5;
		int sum = 0;
		
		while(a <= b)
		{
			sum += a;
			a++;
		}
		System.out.println("Sum of 1st 5 natural number : " + sum);

	}

}
