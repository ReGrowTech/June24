package Capsule_8_Sweety;

public class Buzz_number
  {
      public static void main(String[] args)
      {
          System.out.println("WAP to check whether a number is buzz number or not ,  ");
          System.out.println(" using  if condition  statement ");

          int num = 57 ;
          System.out.println(" number : " +num );
          if (num%7==0 || num%10==7 )
          {
              System.out.println(" It a buzz number  check >> Number  " +num);
          }
          else
          {
              System.out.println(" It not a  buzz number check >> Number  " +num);
          }
      }
  }
