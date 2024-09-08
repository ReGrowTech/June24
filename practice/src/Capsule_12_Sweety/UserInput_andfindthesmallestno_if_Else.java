package Capsule_12_Sweety;

import java.util.Scanner;

public class UserInput_andfindthesmallestno_if_Else
  {
      public static void main(String[] args)
      {
          System.out.println(" WAP to  take 3 no from the user and find the smallest no ");
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter to the first no : ");
          int num1= sc.nextInt();
          System.out.println("num1 "+num1);

          System.out.println("Enter to the Second  no : ");
          int num2= sc.nextInt();
          System.out.println("num2 "+num2);

          System.out.println("Enter to the Third  no : ");
          int num3= sc.nextInt();
          System.out.println("num2 "+num3);

             if(num1<num2 && num1<num3 )
          {
              System.out.println("num1 is the smallest " +num1);

          }
              else if (num2<num1 && num2<num3)
          {
              System.out.println("num2 is the smallest "+num2);

          }
              else
              {
                  System.out.println("num3 is the smallest "+num3);
             }
      }
  }
