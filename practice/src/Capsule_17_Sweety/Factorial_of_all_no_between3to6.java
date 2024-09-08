package Capsule_17_Sweety;

import java.util.Scanner;

public class Factorial_of_all_no_between3to6
{
    public static void main(String[] args) {

        System.out.println(" WAP to print the factorial of all the no between 3 to 6");


        Scanner sc =new  Scanner (System.in);

        System.out.println(" Enter a Numbers ");
        int num=sc.nextInt();
        int factorial = 1;
        for(int i=num;i>0;i--)
        {
            factorial= factorial*i;
        }
        System.out.println(" factorial of thr no "+num +"  is "+factorial);


    }
}
