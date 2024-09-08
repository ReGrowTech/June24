package Capsule_13_Sweety;

public class Print_sum_all_odd_no_between1_to_20
 {
     public static void main(String[] args)
     {
         System.out.println(" WAP to print the sum of all the odd no between 1 to 20 ");
         int sum = 0;

         for (int i=1 ; i<=20 ; i += 2)
         {
             
             sum += i ;
         }
         System.out.println();
         System.out.println(" sum of all the odd no  "+sum);


     }
 }
