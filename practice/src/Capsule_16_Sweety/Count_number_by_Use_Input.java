package Capsule_16_Sweety;

import java.util.Scanner;

public class Count_number_by_Use_Input
{
    public static void main(String[] args) {
        // Wap to count the number of the digit

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter you number that you want to count ");
        int num=sc.nextInt();
        int count =0;

        while(num>0)

        {
            num=num/10;  //250/10= 25 , 25/10=2  0
            
            count++;


        }
        System.out.println();
        System.out.println(" The count of the value inputted by the use is :  "+count);

    }
}
