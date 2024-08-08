package unit_test_6;

public class Table_Of_5 {

	public static void main(String[] args) {
		
//Q9. WAP to print the table of 5. Only even Table. E.g:- 5X2= 10, 5 X 4 = 20; and so on....
		
		int n = 5;
	
		for(int i = 1 ; i <= 10 ; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(n + " X " + i + " = " + (n * i));
			}
		}

	}

}
