package patterns;

public class Pattern_RHP_A_to_E {

	public static void main(String[] args) {
		
//		A
//		A B
//		A B C
//		A B C D
//		A B C D E
		
		int n = 5;
		
		for(int r = 1 ; r <= n ; r++)
		{
			int temp = 65;
			
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print((char)temp + " ");
				temp ++;
			}
			System.out.println();
		}

	}

}
