package patterns_shad;

public class Reverse_RHP {

	public static void main(String[] args) {
//		
//		* * * *
//		* * *
//		* *
//		*
		
		int x = 4;
		
		for(int r = 1 ; r <= x ; r++)
		{
			for(int c = 1 ; c <= (x - r + 1) ; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
