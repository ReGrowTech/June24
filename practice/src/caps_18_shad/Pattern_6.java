package caps_18_shad;

public class Pattern_6 {

	public static void main(String[] args) {
		
		
//		65
//		65 66 
//		65 66 67
//		65 66 67 68
//		65 66 67 68 69
		
		int n = 5;
	
		for(int r = 1 ; r <= n ; r++)
		{
			int temp = 65;
			
			for(int c = 1 ; c <= r ; c++)
			{
				System.out.print(temp + " ");
				temp ++;
			}
			System.out.println();
		}

	}

}
