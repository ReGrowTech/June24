package unit_test_6;

public class Pattern_6 {

	public static void main(String[] args) {
		
//		A C E G
//		A C E
//		A C
//		A
		
		int n = 4 ;
		
		for(int r = 1 ; r <= n ; r++)
		{
			int temp = 65;
			
			for(int c = 1 ; c <= (n - r + 1) ; c++)
			{
				System.out.print((char)temp +" ");
				temp += 2;
			}
			System.out.println();
		}

	}

}
