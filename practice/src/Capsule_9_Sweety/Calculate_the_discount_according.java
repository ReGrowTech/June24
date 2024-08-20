package Capsule_9_Sweety;

import java.util.Scanner;

public class Calculate_the_discount_according
{
    public static void main(String[] args) {
        System.out.println(" Wap to calculate the discount according to the shopping  amount ");
        System.out.println("______________________________________________________________");
        System.out.println("  800 - NO Discount  ");
        System.out.println("  800 TO 1500 -------- 10 % Discount ");
        System.out.println("  1500 TO 2500 -------- 15 % Discount ");
        System.out.println("  2500 TO 5000 -------- 20 % Discount ");
        System.out.println("  5000 ------------------- 30 % Discount ");
        System.out.println(" _____________________________________________________ ");

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the shoping amount  ");
        int orig_shop_amt =sc.nextInt();
        double discount =0;
        if(orig_shop_amt<=800)
        {
        	discount =0 ;
        }
        else if(orig_shop_amt<=1500 )
        {
        	discount=orig_shop_amt*0.10;
        }
        else if(orig_shop_amt<=2500 )
        {
        	discount=orig_shop_amt*0.15;
        }
        else if(orig_shop_amt<=3000 )
        {
        	discount=orig_shop_amt*0.20;
        }
        else
        {
        	discount=orig_shop_amt*0.25;
        	
        }
        
        //Calculate final amount
        
        double final_amt =orig_shop_amt-discount ;
        
        //print orignal amt , discount ,Final amount 
        System.out.println("----------------------------------------------------");
        
        System.out.println("Orignal Amount  : "+orig_shop_amt);
        
        System.out.println("Discount        : "+discount);
        
        System.out.println("Final amount to be paid  : "+final_amt );
        
        System.out.println("----------------------------------------------------");
        
        
        
        
        
        
    }
}
