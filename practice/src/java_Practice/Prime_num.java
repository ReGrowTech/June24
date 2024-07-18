package java_Practice;

import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num,flag=0;
		System.out.println("enter any number");
		num=sc.nextInt();
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
			}
		}
		if(flag==0)
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not a prime");

	}

}
