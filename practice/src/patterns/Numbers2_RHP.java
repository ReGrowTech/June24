package patterns; 

public class Numbers2_RHP {

	public static void main(String[] args) {
		
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		
		
		int m = 4;
		
		for(int r = 1 ; r <= m ; r++)
		{
			for(int c = 1 ; c <= r; c++)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}

}
