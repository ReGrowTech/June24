package program_practic_By_Sweety;

import java.util.Scanner;

public class Ascii_value_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter an ascii value ( 65- 90 and 97 to 122) : ");
		int ascii_val = sc.nextInt();
		
		char ch = (char) ascii_val ;
		
		System.out.println(ascii_val +" Ascii value of   character is "+ch);
		
		
	}

}
