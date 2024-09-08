package Capsule_6_Sweety;

public class Minimumof2number_usingtermaryoperator
 {
     public static void main(String[] args) {
         System.out.println("WAP in java to print the minimum of 2 number using termary operator ");
         int num1= 700;
         int num2= 568;

         int  min= (num1<num2) ? num1:num2 ;
         //Can be replaced with 'Math.min()' call

         System.out.println("num1 =  "+num1);
         System.out.println("num2 =  "+num2);

         System.out.println("It is the minimum " +min);
     }
 }
