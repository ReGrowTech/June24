package Capsule_14_Sweety;

import java.util.Scanner;

public class Reverse_a_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter Your no you want to reverse it ");
        int num = sc.nextInt();
        System.out.println(" Here is your no "+num);
        System.out.println("__________________________________________");
        int rev=0;
        while (num>0)
        {          //123

            int last_digit =num%10;  //123%10 =12,   3  last value  , 12%10=1 ,  2 last value   , 1/10= 0 ,  1  last value  //


            rev= rev*10+last_digit; //

            num=num/10; //

            System.out.println(rev); //
        }
        System.out.println(" The reverse of the no is "+rev ); //

    }
}
