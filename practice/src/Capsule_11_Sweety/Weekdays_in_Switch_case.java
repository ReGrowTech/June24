package Capsule_11_Sweety;

public class Weekdays_in_Switch_case

   {
      public static void main(String[] args)
      {
         System.out.println(" Wap to print the number of the days for  a given day of the week ");

         /* sunday 0
         * monday 1
         * tuesday 2
         * wednesday3
         * thusday 4
         * friday 5
         * saterday 6
         *  */

            int i=5;


            switch (i)
            {
               case 0:
                  System.out.println("Sunday ");
                  break;
               case 1:
                  System.out.println("Monday ");
                  break;
               case 2:
                  System.out.println("Tuesday ");
                  break;
               case 3:
                  System.out.println("Wednesday");
                  break;
               case 4:
                  System.out.println("Thusday ");
                  break;
               case 5:
                  System.out.println("Friday ");
                  break;
               case 6:
                  System.out.println("Saturday  ");
                  break;
               default:
                  System.out.println("Invalid day ");
                  break;
            }


      }
   }
