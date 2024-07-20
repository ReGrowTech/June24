package cap_8;

import java.util.Scanner;

public class Q3_Calculator_UserInput {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st value in calculator");
	int num1 = sc.nextInt();	                           //double num1 = sc.nextDouble();
	System.out.println("Enter 2nd value in calculator");
	int num2 = sc.nextInt();                             //double num2 = sc.nextDouble();
	System.out.println("Enter(type) '+' for add , '-' for sub , '*' for multiply , '/' for division");
	char ch =sc.next().charAt(0);
	/*String str = sc.next();
	char ch = str.charAt(0);*/
	switch (ch)
	{
	case '+':
		System.out.println("The addition of 2 no is:" + (num1+num2));
		break;
		
	case'-':
		System.out.println("The subtraction of 2 no is:" + (num1-num2));
		break;
		
	case'*':
		System.out.println("The multiplication of 2 no is:" + (num1*num2));
		break;
		
	case'/':
	double res = (double)num1/num2;
	System.out.println("The division of 2 no is:" + res ); //(num1/num2)
	break;
	default:
		System.out.println("Invalid Entry");
	}
	
}
}
