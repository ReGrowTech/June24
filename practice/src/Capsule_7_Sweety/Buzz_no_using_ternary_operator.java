package Capsule_7_Sweety;

public class Buzz_no_using_ternary_operator
  {
      public static void main(String[] args)
      {
          System.out.println(" WAP in java  to check whether a no is a buzz no using ternary operator ");
          int num = 14;
          System.out.println(" Number : "+num);

          String  Result =( num%7==0 || num/10==7)?" It is a buzz no  ":"not a buzz no  ";
          System.out.println(" Check wheather a number is a BUZZ Number or not ");
          System.out.println(Result);
      }
  }
