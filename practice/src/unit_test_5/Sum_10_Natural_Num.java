package unit_test_5;

public class Sum_10_Natural_Num {

	public static void main(String[] args) {
	
// Q5. Write a program in Java to find the sum of first 10 natural numbers using a while loop. 
		
		int b = 10;
		int sum = 0;
		
		for(int a = 1 ; a <= b ; a++)
		{
			sum +=a;
		}
		System.out.println("Sum of 10 natural number is : " + sum);

	}

}
