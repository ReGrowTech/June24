package capsule_7_bySweety;

import java.util.*;

public class Greatest3_Nested_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter three  no :");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a +" is greater  ");
			}
			else
			{
				System.out.println(c +" is greater  ");
			}
		}
		else if(b>c)
		{
			System.out.println(b +" is greater  ");	
		}
		else
		{
			System.out.println(c +" is greater  ");	
		}
		}
		
	}

