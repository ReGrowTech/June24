package Capsule_12_Sweety;

import java.util.Scanner;

public class Primitive_datatype_using_Input_Use
  {
      public static void main(String[] args)
      {
          System.out.println("WAP to take int byte float double string and char values from the users and print them  ");
          System.out.println("___________________________________________");
          Scanner sc = new Scanner (System.in);
          System.out.println(" Enter a Integer  ");
          int num1= sc.nextInt();
          System.out.println("Integer value Num1 : " +num1);
          System.out.println("___________________________________________");

          System.out.println(" Enter a Byte  ");
          byte num2 = sc.nextByte();
          System.out.println(" Byte  value Num2 : " +num2);
          System.out.println("___________________________________________");

          System.out.println(" Enter a Float  ");
          float num3 = sc.nextFloat();
          System.out.println("Float  value Num3 : " +num3);
          System.out.println("___________________________________________");

          System.out.println(" Enter a Double  ");
          double num4= sc.nextDouble();
          System.out.println("Double value Num4 : " +num4);
          System.out.println("___________________________________________");

          System.out.println(" Enter a String  ");
          String num5= sc.next();
          System.out.println("String value Num5 : " +num5);
          System.out.println("___________________________________________");

          System.out.println(" Enter a character ");
          char num6=sc.next().charAt(0) ;
          System.out.println("char  value Num6 : " +num6);
          System.out.println("___________________________________________");

      }
  }
