package unit_test_08_shad;

public class Table_5 {

	public static void main(String[] args) {
		
//Q4. WAP to print all the odd table of 5 using while loop only.
//	Eg:- 5X1=5, 5X3=15.....
		
		int n = 5;
		int i = 1;
		
		while(i <= 10)
		{
			if(i % 2 != 0)
			{
				System.out.println(n + " X " + i + " = " + (n * i ));
			}
			i++;
		}
	}

}
