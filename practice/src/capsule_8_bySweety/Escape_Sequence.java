package capsule_8_bySweety;

import java.util.Scanner;

public class Escape_Sequence {

	public static void main(String[] args) {
		
		/*
		 My name is "Regrow Tech " . And I am "24" Year old . 
		 
		 */
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Age :  ");
		int age= sc.nextInt ();
		
	    sc.nextLine();
	    
		System.out.print("Enter Name :  ");
		String name= sc.nextLine();
		
		System.out.println(" My name is \" " +name +" \" ." + "  \n And I am \" " + age + " \" Year old  . ");
		
	}
	

}
