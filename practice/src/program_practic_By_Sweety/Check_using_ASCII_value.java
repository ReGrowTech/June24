package program_practic_By_Sweety;

import java.util.Scanner;

public class Check_using_ASCII_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter a  integer - between (0 to 127) ");//
		int ascii_val =sc.nextInt();
		
		
		if( ascii_val>=0 && ascii_val<=127)
		{
		  char ch =(char)ascii_val	;
		  System.out.println("The Character for Ascii value "+ ascii_val +" is "+ch);
		  
		}
		else if((ascii_val>= 65 && ascii_val <=90) || (ascii_val>= 97 && ascii_val <=122))
		{
			 System.out.println("It is an alphabet.");
		}
		else if( ascii_val >=48 && ascii_val<=58)
		{
			System.out.println("its a number ");
		}
		else
		{
			System.out.println("its a special number ");	
		}
		
		
	}

}
