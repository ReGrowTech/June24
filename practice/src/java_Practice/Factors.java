package java_Practice;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("enter number to find factors");
		num=sc.nextInt();
		System.out.println("Factors are :");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(" "+i);
			}
		}
		sc.close();

	}

}
