//WAP to print the no which is divisible by both (3&5) or individually by 3 & 5 using if -else 

package if_else;

public class Div_by_2No_0r_individuall {
	public static void main(String args[])
	{
	  int num = 15;
 	 if (num%3 == 0 && num%5==0)
	{
	System.out.println(num + ":is divisible by both");
	}
	else if(num%3 == 0 )
	{
	System.out.println(num + ":is divisible by 3");
	}
	else if (num%5==0)
	{
	System.out.println(num+ ":is divisible by 5");
	}
	else
	{
	System.out.println(num+ ":is not divisible by any of three");
	}
	}	
	}


