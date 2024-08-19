package caps_08_shad;
import java.util.*;

public class Calculator_User_Input {

	public static void main(String[] args) {
		
// Create a calculator using user input and display the correct answer. 	

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value");
		double n1 = sc.nextDouble();
		
		System.out.println("Enter the second value");
		double n2 = sc.nextDouble();
		
		System.out.println("Enter the operator");
		char ch = sc.next().charAt(0);
				
		switch(ch)
		{
		case '+':
			System.out.println("Addition of 2 numbers : " + (n1 + n2));
			break;
			
		case '-':
			System.out.println("Subtraction of 2 numbers : " + (n1 - n2));
			break;
		
		case '*':
			System.out.println("Multiplication of 2 numbers : " + (n1 * n2));
			break;
		
		case '/':
//			 if(n2 != 0)
//			{
				System.out.println("Division of 2 numbers : " + (n1 / n2));
//			}
//			else
//			{
//				System.out.println("Error !... Denominator should not be 0");
//			}
			break;
		

		case '%':
			
			System.out.println("Modulus of 2 numbers : " + (n1 % n2));
			break;
		
		default:
			System.out.println("Invalid Operator");
		}
	}

}
