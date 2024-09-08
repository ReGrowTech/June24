package Capsule_7_Sweety;

public class Maximumof_3usingTernaryoperator
   {
       public static void main(String[] args)
       {
           System.out.println("WAP to print the maximum of 3 using Ternary operator");
           int a=10;
           int b=20;
           int c=15;
           // Using ternary operator to find the maximum of three numbers
           int max = (a>b && a>c)? a : (b>c)? b:c ;

           System.out.println();
           System.out.println("The maximum of three numbers is: " + max);



       }
   }
