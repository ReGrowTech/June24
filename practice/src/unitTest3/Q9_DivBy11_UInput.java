package unitTest3;

import java.util.Scanner;

public class Q9_DivBy11_UInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		if(num%11==0)
		{
			System.out.println(num + ":is div by 11");
		}
		else
		{
			System.out.println(num + ":is not div by 11");
		}
	}

}
