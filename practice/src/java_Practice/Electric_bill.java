package java_Practice;

import java.util.Scanner;

public class Electric_bill {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double bill=0.0D;
		int units=0;
		System.out.println("Enter no of units consumed");
		units=sc.nextInt();
		if(units>0&&units<=100) {
			bill=units*10;
		}
		else if(units>100&&units<=200) {
			bill=1000+(units-100)*15;
		}
		else if(units>200&&units<=300) {
			bill=2500+(units-200)*20;
		}
		else {
			bill=4500+(units-300)*25;
		}
		System.out.println("Total Bill :"+bill);
		sc.close();
	}
 
}
