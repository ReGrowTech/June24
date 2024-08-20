package Capsule_14_Sweety;

public class Print_SumOf_first_5_NaturalNumber_For_loop
 {
     public static void main(String[] args)
     {
         System.out.println("WAP to print the Sum Of first 5 Natural Number  ");

         int sum = 0;

         for (int i=1 ; i<=5; i++)//1 2 3 4 5
         {
             System.out.println(i);//1+2+3+4+5
             sum += i ;// 0+1=1 ,0+2 ,0+3,0+4,0+5


         }
         System.out.println(" sum of all the Natural no   "+sum);// 1+2+3+4+5= 15
     }
 }
