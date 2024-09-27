package capsule_9_bySweety;

import java.util.Scanner;

public class Print_all_the_number_1to30_divisible_by3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a  no  :  ");
		int n= sc.nextInt ();
		
		while(n<=30)
		{
			if(n%3==0)
			{
				System.out.print(n +" ");
			}
			n++;
		}
	}

}
