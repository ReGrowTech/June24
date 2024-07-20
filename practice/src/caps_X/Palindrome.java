package caps_X;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
// 4.WAP to check whether the number is Palindrome or not. Take input from the user.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any numbers");
		int palin = sc.nextInt();
		
		int ld;
		int rev=0;
		int palindrome = palin;
		
		while (palin > 0)
		{
			ld = palin % 10;
			palin = palin / 10;
			rev = (rev * 10) + ld;
			
		}
		if(palindrome == rev)
		{
			System.out.println("Yes its a Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
