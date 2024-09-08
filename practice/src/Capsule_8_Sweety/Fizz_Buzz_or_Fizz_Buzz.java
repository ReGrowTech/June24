package Capsule_8_Sweety;

public class Fizz_Buzz_or_Fizz_Buzz
   {
       public static void main(String[] args)
       {
           System.out.println(" WAP to check wheather a number is Fizz, Buzz or Fizz Buzz");
           System.out.println(" 1. Fizz is a number that is divisible by 3");
           System.out.println(" 2.Buzz is a number that is divisible by 5");
           System.out.println(" 3.Fizz Buzz is a number that is divisible by both 3 and 5");

           int num=525;

           if( num%3==0 && num%5==0)
           {
               System.out.println(" It is a Fizz Buzz no  "+num);
           }
           else if (num%3==0)
           {
               System.out.println("it is a fizz no "+num );
           }
           else  if (num%5==0)
            {
                System.out.println("it is a Buzz no "+num );
            }
           else if(num%3!=0 && num%5!=0)
           {
               System.out.println("it is some thing else.>>> Default  ");
           }
       }
   }
