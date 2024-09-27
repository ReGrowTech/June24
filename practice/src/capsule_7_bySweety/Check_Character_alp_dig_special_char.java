package capsule_7_bySweety;

import java.util.Scanner;

public class Check_Character_alp_dig_special_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.print(" Enter a Character :");
		char a =sc.next().charAt(0);
		
		if(a>='a'&& a<='z'&& a>='A'&& a<='Z')
		{
			System.out.println(" its a Alphabet");
		}
		else if(a>='0'&& a<='9')
		{
			System.out.println(" its a digit ");
		}
		else
		{
			System.out.println(" its a special character ");
		}
		
	}

}
