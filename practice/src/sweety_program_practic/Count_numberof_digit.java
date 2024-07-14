package sweety_program_practic;

import java.util.Scanner;

public class Count_numberof_digit {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(" Numbe of digit in the number  are "+"  : "+count);
	}

}
