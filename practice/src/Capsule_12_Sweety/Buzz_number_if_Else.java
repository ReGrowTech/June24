package Capsule_12_Sweety;

import java.util.Scanner;

public class Buzz_number_if_Else
{
    public static void main(String[] args)
    {
        System.out.println("_____________________________________________________________________________");
        System.out.println(" WAP to take a no input and check whether it is a Buzz number or not ");
        System.out.println(" Buzz number  are those number that are divisible by seven and end with seven ");
        System.out.println("_____________________________________________________________________________");
        Scanner sc=new Scanner (System.in );

        System.out.println(" Enter a number : ");
        int num = sc.nextInt();
        System.out.println(" number  "+num);

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
