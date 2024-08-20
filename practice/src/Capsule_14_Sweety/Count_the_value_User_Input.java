package Capsule_14_Sweety;

import java.util.Scanner;

public class Count_the_value_User_Input
  {
      public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter you number that you want to count ");
          int num=sc.nextInt();
          int count =0;
        
          while(num>0)
          {
              num=num/10; 
              count++;
              

          }
         
          System.out.println(" The count of the value inputted by the use is :"+count);
         

      }

  }
