package patterns_shad;

public class Pattern_13 {

	public static void main(String[] args) {
		
//		A
//		B B 
//		C C C
//		D D D D
//		E E E E E
		
		int n = 5;
		int temp = 65;
		
		for(int r = 1 ; r <= n ; r++)
		{	
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print((char)temp + " ");
				
			}
			System.out.println();
			temp ++;
		}

	}

}
