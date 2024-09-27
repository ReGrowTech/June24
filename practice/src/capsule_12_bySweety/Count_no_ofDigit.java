

package capsule_12_bySweety;

import java.util.Scanner;

public class Count_no_ofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in );
		System.out.print(" enter a simple no  :");
		int n =sc.nextInt();//4579243
		int count = 0;
		while (n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(" count the number  of digit present in the" +n +" is : "+count);
	}

}
