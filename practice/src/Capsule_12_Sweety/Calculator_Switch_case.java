package Capsule_12_Sweety;

import java.util.Scanner;

public class Calculator_Switch_case
 {
     public static void main(String[] args)
     {
         System.out.println("________________________________________________________");
         System.out.println(" Wap to calculate the Sum / differences / product/ quotient/remainder using 2 no using switch case  ");
         System.out.println("________________________________________________________");
         System.out.println(" choice 1. Sum");
         System.out.println(" choice 2. difference");
         System.out.println(" choice 3. product ");
         System.out.println(" choice 4. quotient");
         System.out.println(" choice 5. remainder ");
         System.out.println("________________________________________________________");

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Two  numbers for the  Operation  ");
         System.out.println(" Enter 1st no ");
         int num1= sc.nextInt();
         System.out.println("num1 value "+num1);
         System.out.println("________________________________________________________");

         System.out.println(" Enter 2nd no ");
         int num2= sc.nextInt();
         System.out.println("num2 value "+num2);
         System.out.println("________________________________________________________");

         System.out.println("Enter your choice");
         int n=sc.nextInt();

         switch(n)
         {
             case 1 : int sum= num1+num2;
             {
                 System.out.println(" Sum of two numbers are "+sum );
                 break;
             }

             case 2 : int diff = num1-num2;
             {
                 System.out.println(" Difference  of two numbers are "+diff );
                 break;
             }

             case 3 : int product = num1*num2;
             {
                 System.out.println(" product  of two numbers are "+product);
                 break;
             }

             case 4 : int quotient = num1/num2;
             {
                 System.out.println(" quotient of two numbers are "+quotient );
                 break;
             }

             case 5 : int remainder= num1%num2;
             {
                 System.out.println(" Sum of two numbers are "+remainder );
                 break;
             }
             case 6 :
             {
                 System.out.println(" not valid  " );
                 break;
             }


         }

     }
 }
