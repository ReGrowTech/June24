package Capsule_8_Sweety;

public class Findthelargest3no_Elseif

  {
      public static void main(String[] args)
      {
          System.out.println("WAP in java to find the largest of 3 no ");
          int num1= 5897;
          int num2= 998667677;
          int num3= 34;
          System.out.println(" num1  :  " +num1);
          System.out.println(" num2  :  " +num2);
          System.out.println(" num3  :  " +num3);
          if(num1>num2 && num1>num3)
          {
              System.out.println(" it is the largest no -- num1  "+num1 );
          }
          else if (num2>num1 && num2>num3)
              {
                  System.out.println(" it is the largest no -- num2  "+num2 );
              }
          else
          {
              System.out.println(" it is the largest no -- num3  "+num3 );
          }
      }
  }
