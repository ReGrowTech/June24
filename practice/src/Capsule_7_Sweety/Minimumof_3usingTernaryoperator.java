package Capsule_7_Sweety;

public class Minimumof_3usingTernaryoperator
 {
     public static void main(String[] args)
     {
         System.out.println("WAP to print the Min of 3 using Ternary operator");
         int a=10;
         int b=20;
         int c=15;
         // Using ternary operator to find the min of three numbers
         int min = (a<b && a<c)? a : (b<c)? b:c ;

         System.out.println();
         System.out.println("The minimum of three numbers is: " + min );
     }
 }
