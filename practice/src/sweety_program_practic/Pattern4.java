package sweety_program_practic;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num =sc.nextInt();
            
            for(int row_no=1;row_no<=num;row_no++)
            {
               for(int colum_no=1;colum_no<=(num-row_no+1);colum_no++)
                {
            	 System.out.print(" ");
                }
               for(int k=1;k<=row_no;k++)
               {
            	   System.out.print(k);
               }
               System.out.println();
            }
            
	}

}
