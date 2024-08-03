package program_practic_By_Sweety;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a num  : ");
		int num =sc.nextInt();//123
		
		int rev=0;
		
		while(num>0)
		{ 
			      
			int lst_dig=num%10; // last dig 
			
			rev= rev*10+lst_dig;
			
			num=num/10;
			
		}
	
		System.out.println(" Reverse the number : "+rev);
		
		
		
	}

}
