package unitTest2;

public class Q10_PosNeg_EvenOdd {
public static void main (String args[]) {
	int no = 37;
	if(no>0)
	{
	if(no%2==0)
	{
		System.out.println(no + ":no is positive and even");
	}
	else
	{
		System.out.println(no + ":no is positive and odd");
	}
	}
	else
	{
		if(no<0)
		{
			if(no%2!=0)
			{
				System.out.println(no + ":no is negative and odd");	
			}
			else
			{
				System.out.println(no + ":no is negative and even");
			}
		}
		else
		{
			System.out.println(no + ":no is zero");
		}
	}
}
}
