package sweety_program_practic;

import java.util.Scanner;

public class Check_whther_alphaber_isvowel_consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		Scanner sc =new Scanner (System.in);
		
		System.out.print(" Enter a Character to find its Vowel or Consonent  :  ");
		
		char ch= sc.next().charAt(0);
		
		if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U')
		{
			System.out.println(" its a vowel "+ch);
		}
		else
		{
			System.out.println(" its a consonent  "+ch);
		}
		
	}

}
