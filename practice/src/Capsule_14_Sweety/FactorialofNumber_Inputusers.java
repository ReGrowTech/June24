package Capsule_14_Sweety;

public class FactorialofNumber_Inputusers
  {
      public static void main(String[] args)
      {
          System.out.println("WAP  to find the Factorial of a number enter by the users ");

           /* number = 5        her n is the number
           n*(n-1)+n(n-2)++n(n-3)++n(n-4)++n(n-5)=
           5*4*3*2*1
        */


          int num = 5;
          int factorial=1;
          System.out.println(" num value "+num);
          System.out.println(" factorial value "+factorial);
          System.out.println("______________Procedure start ____________________");

          for(int i=1;i<=num;i++)// ilteration (i is less than the num couted )1 2 3
          {
              factorial*=i;//1*1=1 2*1=2 3*1=3
              System.out.println(i);//1 2 3
              System.out.println(" Factorial of the number"+num +" is "+factorial);

          }



      }
  }
