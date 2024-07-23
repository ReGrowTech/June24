package practice_home;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second value");
		int n2 = sc.nextInt();
		
		System.out.println("Enter the operator");
		char ch = sc.next().charAt(0);
		
		double o;
		
		switch(ch)
		{
		case '+':
			o =  n1 + n2;
			System.out.println("Addition of 2 numbers : " + o);
			break;
			
		case '-':
			o =  n1 - n2;
			System.out.println("Subtraction of 2 numbers : " + o);
			break;
		
		case '*':
			o =  n1 * n2;
			System.out.println("Multiplication of 2 numbers : " + o);
			break;
		
		case '/':
			o =  n1 / n2;
			System.out.println("Division of 2 numbers : " + o);
			break;
		

		case '%':
			o =  n1 % n2;
			System.out.println("Modulus of 2 numbers : " + o);
			break;
		
		default:
			System.out.println("Invalid Operator");
		}
	}
				
		

	}


