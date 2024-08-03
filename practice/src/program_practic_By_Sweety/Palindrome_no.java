package program_practic_By_Sweety;

import java.util.Scanner;

public class Palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a num  : ");
		int orig_num =sc.nextInt();//123
		
		int num=orig_num;
		int rev=0;
		
		while(num>0)
		{ 
			      
			int lst_dig=num%10; // last dig 
			
			rev= rev*10+lst_dig;
			
			num=num/10;
			
		}
	
		if(orig_num==rev)
		{
			System.out.println(" its a palindrome no : "+rev);
		}
		else
		{
			System.out.println(" its not  palindrome no : "+rev);
		}
		
	}

}
