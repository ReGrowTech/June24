package unit_test_05_shad;

public class OddTable_Of_5 {

	public static void main(String[] args) {
		
//Q13. Write a program to print the table of 5. Only odd table. Example:- 5 X 1= 5, 5 X 3 = 15, and so on.
		
		int n = 5;
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(n + " X " + i + " = " + (n * i));
			}
		}

	}

}
