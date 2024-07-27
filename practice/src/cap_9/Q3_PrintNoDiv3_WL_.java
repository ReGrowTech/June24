package cap_9;

import java.util.Scanner;

public class Q3_PrintNoDiv3_WL_ 
{
public static void main(String args[])
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter value of N");
	int n = sc.nextInt();
	int a = 1;
	while(a<=n)
	{
		if(a%3==0)
		{
			System.out.println(a);
		}
		a++;
	}
	
}
}
