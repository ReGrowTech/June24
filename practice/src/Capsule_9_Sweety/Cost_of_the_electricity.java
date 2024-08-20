package Capsule_9_Sweety;
/*write a program to print the cost of the cost of the electricity  consumable  based on the number of the units

1 to 100 unit is rs 10 unit
100 to 200 unit - rs 15 unit
200 to 300 unit - rs 20 unit
above 300 unit - rs 25 / unit
 */

import java.util.Scanner;

public class Cost_of_the_electricity
 {
     public static void main(String[] args)
     {
         System.out.println("WAP to print the cost of the electricity consumable  based on the number of the units ");

         // homework
         System.out.println("______________________________________________________________________________");
         System.out.println("the cost of the electricity  consumable  based on the number of the units");
         System.out.println("1 to 100 unit is rs 10 unit ");
         System.out.println("100 to 200 unit - rs 15 unit");
         System.out.println("200 to 300 unit - rs 20 unit ");
         System.out.println("above 300 unit - rs 25 / unit ");
         System.out.println("_________________________________________________________________________________");

         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter the cost of Electricity Consumable  by the User ");
         double comsume_electricity=sc.nextDouble();
         System.out.println(" Electricity consumed : "+comsume_electricity);
         System.out.println("__________________________________________________________________________________");

         double cost =0;
         if(comsume_electricity<=100)
         {
             cost=comsume_electricity*10;

         }
         else if(comsume_electricity<=200)
         {
             cost=100*10+(comsume_electricity-100)*15;

         }
         else if(comsume_electricity<=300)
         {
             cost=100*10+100*15+(comsume_electricity-200)*20;

         }
         else
         {
             cost=100*10+100*15+-100*20+(comsume_electricity-300)*25;
         }
         System.out.println(" the cost of the electricity consumed "+ "Rs "+cost);

     }
 }
