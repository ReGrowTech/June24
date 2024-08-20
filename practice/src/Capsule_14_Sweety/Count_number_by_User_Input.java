package Capsule_14_Sweety;

import java.util.Scanner;

public class Count_number_by_User_Input
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter you number that you want to count ");
        int num=sc.nextInt();
        int count =0;
        int sum=0;
        while(num>0)

        {
            num=num/10;  //250/10= 25 , 25/10=2  0

            System.out.print(    num + "  ");
            count++;

            sum+=num;

        }
        System.out.println();
        System.out.println(" The count of the value inputted by the use is :  "+count);
        System.out.println(" sum of the digit are "+sum);

    }

}
