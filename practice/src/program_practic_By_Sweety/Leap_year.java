package program_practic_By_Sweety;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year :  ");
		int num =sc.nextInt();
		
		if(num%4==0)
		{
			if(num%100==0)
			{
				if(num%400==0)
				{
					System.out.println("It a leap year "+num);
				}
				else
				{
					System.out.println("its not a leap year "+num);
				}
				
			}
			else
			{
				System.out.println("Its a leap year "+num);
			}
		}
		else
		{
			System.out.println("Its not a leap year"+num);
			
		}
		
	  }
	}


