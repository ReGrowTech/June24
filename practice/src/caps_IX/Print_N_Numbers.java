package caps_IX;
import java.util.*;

public class Print_N_Numbers {

	public static void main(String[] args) {
	
//1. WAP to print all the numbers from 1 to N. Take N as input from the user. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N number of value : ");
		int n = sc.nextInt();
		int a = 1;
		
		while(a <= n)
		{
			System.out.println(a);
			a++;
		}

	}

}
