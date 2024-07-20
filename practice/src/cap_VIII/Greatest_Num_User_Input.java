package cap_VIII;
import java.util.*;

public class Greatest_Num_User_Input {

	public static void main(String[] args) {
		
// Write a program to find the greatest of three numbers, take input from user. 

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		
		if((a > b) && (a > c))
		{
			System.out.println(a + " is greater ");
		}
		else if(b>c)
		{
			System.out.println(b + " is greater ");
		}
		else
		{
			System.out.println(c + " is greater ");
		}
	}

}
