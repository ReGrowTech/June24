package unitTest4;

import java.util.Scanner;

public class Q6_Calculator_UserInp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  1st Value");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd value");
		int n2 = sc.nextInt();
		
		System.out.println("Enter '+' for addition, '-' for subtraction , '*' for multiplication, '/' for division");
		System.out.println("Your character will process after entering the characters mention above");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case'+':
			System.out.println("The addition of two numbers is:"+(n1+n2));
			break;
			
		case'-':
			System.out.println("The subtraction of two numbers is:"+(n1-n2));
			break;
			
		case'*':
			System.out.println("The multiplication of two numbers is:"+(n1*n2));
			break;
		case'/':
			double divi = (double)n1/n2;
			System.out.println("The division of two numbers is:"+divi);
			break;
			default:
				System.out.println("Invalid character given by USER");
				
		}
		
	}

}
