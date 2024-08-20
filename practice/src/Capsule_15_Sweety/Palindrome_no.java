package Capsule_15_Sweety;

import java.util.Scanner;
// palindrome number is also called as reverse no
public class Palindrome_no
{
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);
        System.out.println(" enter a number ");
        int n=sc.nextInt();

        int num=n;
        int remainder;
        int rev=0;

        while (num>0)
        {
            remainder=num%10;
            //System.out.println(remainder +" the number is same as the inputed value ");
            rev=rev*10+remainder;

            num=num/10;



        }
        if (rev==n)
        {
            System.out.println(" its is same as user input ");
        }
        else
        {
            System.out.println(" not same ");
        }

    }
}
