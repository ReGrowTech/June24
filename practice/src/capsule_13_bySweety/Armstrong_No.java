package capsule_13_bySweety;

import java.util.Scanner;

public class Armstrong_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.print("Enter a simple no : ");
		int n= sc.nextInt();
		int n1 =n;
		int n2=n;
		
		/*
		 * Armstrong no 
		 * 
		 * here 3 is the no of digit 
		 * 1. count 
		 * 2.last digit 
		 * 3.Power 
		 * 4.Sum 
		 * 5. compare 
		 * 
		 */
		int count =0 ;
		while(n>0)
		{
			n = n/10 ;
			count++;
		}
		
		//Find last digit , then power each digit with the digit no and then sum them
		
		
		int ld =0;
		int sum=0;
		
		while(n1>0)
		{
			ld = n1%10 ;
			n1=n1/10 ;
			int power =(int) Math.pow(ld, count);
			sum = sum+power ;
		}
		if(sum==n2)
		{
			System.out.println(n2 +"  this number is Armstrong Number ");
		}
		else
		{
			System.out.println(n2 +" this number  is not Armstrong Number ");
		}
		
		
	}
	

}
