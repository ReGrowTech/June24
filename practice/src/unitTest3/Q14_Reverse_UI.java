package unitTest3;

import java.util.Scanner;

public class Q14_Reverse_UI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number");
		int num = sc.nextInt();
		int ld;
		int rev = 0;
		
		while(num>0)
		{
			ld = num%10;
			num = num/10;
			rev = (rev*10)+ld;
		}
		System.out.println(rev);
		
	}

}
