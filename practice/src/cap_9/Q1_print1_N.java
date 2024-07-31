package cap_9;

import java.util.Scanner;

public class Q1_print1_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter value of N");
		int n = sc.nextInt();
		int a = 1;
		while(a<=n)
		{
			System.out.println(a);
			a++;
		}
	
	}

}
