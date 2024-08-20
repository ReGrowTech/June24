package Capsule_10_Sweety;

import java.util.Scanner;

public class Character_check
  {
      public static void main(String[] args)
      {
         
           /*
             to check whether a character is an alphabet , number or special character using character 

           */
    	  Scanner sc =new Scanner (System.in);
    	  System.out.print(" enter a Character to check : ");
    	  char ch =sc.next().charAt(0);
    	  
    	  if((ch>='A' && ch<='Z')||(ch>='a'&& ch<='z'))
    	  {
    		  System.out.println(" its a alphabet "+ch);
    	  }
    	  else if(ch>='0'&& ch<='9')
    	  {
    		  System.out.println(" its a Digit "+ch);
    	  }
    	  else
    	  {
    		  System.out.println(" its a special character  "+ch);

    	  }
      }
   }
