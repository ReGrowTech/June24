package capsule_9_bySweety;

import java.util.Scanner;

public class Print_all_no_1to20_loop_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a  no  :  ");
		int n= sc.nextInt ();
		
		while(n<=20)
		{
			System.out.print(n +" ");
			n++;
		}
	}

}
