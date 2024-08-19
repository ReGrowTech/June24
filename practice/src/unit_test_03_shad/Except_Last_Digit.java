package unit_test_03_shad;
import java.util.*;

public class Except_Last_Digit {

	public static void main(String[] args) {

// Q7. WAP to print all the digits except last digit.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		System.out.println("All the digit except last digit is : " + num/10);

	}

}
