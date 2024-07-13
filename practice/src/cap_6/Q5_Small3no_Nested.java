package cap_6;

public class Q5_Small3no_Nested {
	 public static void main(String args[]){
			int num1 = 13;
			int num2 = -5;
			int num3 = -7;
			if (num1 < num2)
		   	{
			if (num1<num3)
			{
			System.out.println(num1 + ":is smallest no");
			}
			else
			{
			System.out.println(num3 + ":is the smallest no");
			}
			}
			else
			{
			if(num2<num3)
			{
			System.out.println(num2 + ":is the smallest no");
			}
			else
			{
			System.out.println(num3 + ":is the smallest no");
			}
			}
			}

}
