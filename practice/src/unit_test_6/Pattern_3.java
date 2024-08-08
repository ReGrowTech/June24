package unit_test_6;

public class Pattern_3 {

	public static void main(String[] args) {
		
//		1 2 3 4
//		1 2 3
//		1 2
//		1
	
		int n = 4 ;
		
		for(int r = 1 ; r <= n ; r++)
		{
			for(int c = 1 ; c <= (n - r + 1) ; c++)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
		

	}

}
