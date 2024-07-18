package java_Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int prod=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num for factorial");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			prod=prod*i;
		}
		System.out.println("factorial is:"+prod);
		sc.close();
		
	}

}
