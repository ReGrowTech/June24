package capsule_14_bySweety;

import java.util.Scanner;

public class Count_no_of_Digit_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter a number ");
		int n = sc.nextInt();
        int count = 0 ;
        
        do 
        {
        n = n/10 ;
        count++;
        	
        }
	    while (n>0);
	    System.out.println(" Count of of the no input by the user : "+count );
	}

}
