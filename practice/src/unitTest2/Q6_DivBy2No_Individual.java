//WAP to print the no which is divisible by both (3&7) or individually by 3 & 7 using if -else 

package unitTest2;

public class Q6_DivBy2No_Individual {
public static void main(String args[]) {
	 int num = 21;
 	 if (num%3 == 0 && num%7==0)
	{
	System.out.println(num + ":is divisible by both");
	}
	else if(num%3 == 0 )
	{                                                                          
	System.out.println(num + ":is divisible by 3");
	}
	else if (num%7==0)
	{
	System.out.println(num+ ":is divisible by 5");
	}
	else
	{
	System.out.println(num+ ":is not divisible by any of three");
	}

}
}
