package Capsule_11_Sweety;

public class Print_thenumber_0_to_9inwords
     {
         public static void main(String[] args)
         {
             System.out.println("Wap to print  the number 0 to 9  in words ");
             for (int i = 0; i <= 9; i++)
             {
                 switch (i) {
                     case 0:
                         System.out.println("Zero");
                         break;
                     case 1:
                         System.out.println("One");
                         break;
                     case 2:
                         System.out.println("Two");
                         break;
                     case 3:
                         System.out.println("Three");
                         break;
                     case 4:
                         System.out.println("Four");
                         break;
                     case 5:
                         System.out.println("Five");
                         break;
                     case 6:
                         System.out.println("Six");
                         break;
                     case 7:
                         System.out.println("Seven");
                         break;
                     case 8:
                         System.out.println("Eight");
                         break;
                     case 9:
                         System.out.println("Nine");
                         break;
                     default:
                         System.out.println("Invalid number");
                         break;
                 }


             }

         }
     }