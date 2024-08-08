package caps_18;

public class Pattern_8 {

	public static void main(String[] args) {
		
//		E D C B A
//		E D C B
//		E D C
//		E D
//		E

		int n = 5;
		
		for(int r = 1 ; r <= n ; r++)
		{
			int temp = 69;
			
			for(int c = 1 ; c <= (n - r + 1) ; c++)
			{
				//System.out.print((char)(70 - c) + " ");
				
				System.out.print((char)temp + " ");
				temp --;
			}
			System.out.println();
		}

	}

}
