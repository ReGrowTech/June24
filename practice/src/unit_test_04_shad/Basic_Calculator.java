package unit_test_04_shad;

import java.util.*;

public class Basic_Calculator {

	public static void main(String[] args) {
		
// Q6. Write a program using user input. Create a basic Calculator.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		double a = sc.nextDouble();
		
		System.out.println("Enter 2nd number");
		double b = sc.nextDouble();
		
		System.out.println("Enter any Operator: + for add , - for subtract, * for multiply, / for divide");
		char ch = sc.next().charAt(0);

		switch(ch)
		{
		case '+':
			System.out.println("The addition of two numbers : " + (a + b));
			break;
			
		case '-':
			System.out.println("The subtraction of two numbers : " + (a - b));
			break;
			
		case '*':
			System.out.println("The multiplication of two numbers : " + (a * b));
			break;
			
		case '/':
			System.out.println("The division of two numbers : " + (a / b));
			break;
			
		default:
			System.out.println("Invalid Operator");
		}
		
	}

}
