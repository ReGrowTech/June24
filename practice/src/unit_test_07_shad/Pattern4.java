package unit_test_07_shad;

public class Pattern4 {

	public static void main(String[] args) {
		
//		5 4 3 2 1
//		4 3 2 1
//		3 2 1
//		2 1
//		1
		
		int n = 5;
		
		for(int r = 1 ; r <= n ; r++)
		{	
			for(int c = 1 ; c <= (n - r + 1) ; c++)
			{
				System.out.print((n - c - r + 2 )+ " ");
			}
			System.out.println();
		}		

	}

}
