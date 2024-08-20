package Capsule_10_Sweety;

public class Check_whether_a_Character_is

 {
     public static void main(String[] args)
     {
         System.out.println("Wap to check whether a character in an alphabet , number or a special using ASCII value ");
         char ch = 'y';

         if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
             System.out.println(ch + " is an alphabet.");
         }

         else if (ch >= '0' && ch <= '9') {
             System.out.println(ch + " is a number.");
         }

         else {
             System.out.println(ch + " is a special character.");
         }

     }
 }
