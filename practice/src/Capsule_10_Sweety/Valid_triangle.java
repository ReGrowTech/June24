package Capsule_10_Sweety;

public class Valid_triangle
  {
      public static void main(String[] args)
      {
          System.out.println("WAP to check Whether the given set of side made a valid triangle ");
          double a = 5.0;
          double b = 7.0;
          double c = 10.0;


          if ((a + b > c) && (a + c > b) && (b + c > a)) {
              System.out.println("The given sides form a valid triangle.");
          } else {
              System.out.println("The given sides do not form a valid triangle.");
          }
      }
  }
