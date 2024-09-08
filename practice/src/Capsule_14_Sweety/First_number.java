package Capsule_14_Sweety;

import java.util.Scanner;

public class First_number
{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter your  number ");
        int num =sc.nextInt();
        System.out.println(" number : "+num);
        int count=0;
        while (num>0)
        {
            num=num/10;
            count++;
            if (count==1)
            {
                System.out.println(" Number you got before you got the First  digit "+num);

                num=num/10;

                System.out.println("First digit of the number is "+num);
            }
            

        }
    }
}
