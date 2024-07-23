package unit_test_2;

public class Positive_Negative_Even_Odd {

	public static void main(String[] args) {
		
//  Q10. Write a program to check if a given number is positive, negative or zero. Additionally, if the number is positive or negative, 
//	determine if it is even or odd. (If the number is - 4 the output should be the number is negative and even). 
		
		int i = -4;
		
		if(i > 0)
		{
			if(i % 2 == 0)
			{
				System.out.println("The number is Positive & Even");
			}
			
			else
			{
				System.out.println("The number is Positive & Odd");
			}
		}
		
		else if( i < 0)
		{
			if(i % 2 == 0)
			{
				System.out.println("The number is Negative & Even");
			}
			
			else
			{
				System.out.println("The number is Negative & Odd");
			}
		}
		
		else
		{
			System.out.println("The number is Zero");
		}
		

	}

}
