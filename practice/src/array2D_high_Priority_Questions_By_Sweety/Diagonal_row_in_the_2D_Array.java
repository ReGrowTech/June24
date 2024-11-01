package array2D_high_Priority_Questions_By_Sweety;

public class Diagonal_row_in_the_2D_Array {

	public static void main(String[] args) {
		
		 int a[][] = {{10,20,3,9},{40,5,10,60},{70,8,16,90},{5,21,98,54}};
			
			for(int r=0;r<a.length;r++)
			{
				for(int c=0;c<a[r].length;c++)
				{
					if(r==c)
					{
						System.out.print(a[r][c]+" ");
					}
					
				}
				System.out.println(" ");
			}

	}

}
