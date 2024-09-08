package Capsule_12_Sweety;


import java.util.Scanner;

public class UserInput_and_add_them

   {
       public static void main(String[] args)
       {
           System.out.println(" WAP to take 2 number from the user and add them ");
           Scanner sc = new Scanner(System.in);
           System.out.println(" Enter the first no ");
           int num1 = sc.nextInt();
           System.out.println("num1  : "+num1);

           System.out.println(" Enter the Second no ");
           int num2 = sc.nextInt();
           System.out.println("num2  : "+num2);
           int sum = num1 + num2 ;
           System.out.println(" Sum of the the two no taken by the user is  : "+sum);

       }
   }
