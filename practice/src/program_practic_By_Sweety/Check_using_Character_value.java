package program_practic_By_Sweety;

import java.util.Scanner;

public class Check_using_Character_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println(" its to check whether the user input is alphabet or number or a special character ");
	     Scanner sc =new Scanner(System.in);
		 System.out.println(" Enter a character ");
		 char ch =sc.next().charAt(0);
		 
		 if((ch>='a' && ch<='z'|| ch>='A'&& ch<='Z'))
		 {
			 System.out.println("its a character "+ch);
		 }
		 else if (ch>='0' && ch<='9') //here we check character is less than 0 to greater than 9
	        {
	            System.out.println("its a digit "+ch);
	        }
	        else
	        {
	            System.out.println(ch+" its a special character ");
	        }
		
	}

}
