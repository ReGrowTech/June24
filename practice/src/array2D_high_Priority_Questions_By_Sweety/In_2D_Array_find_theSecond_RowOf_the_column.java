package array2D_high_Priority_Questions_By_Sweety;

public class In_2D_Array_find_theSecond_RowOf_the_column {

	public static void main(String[] args) {
		
		int a[][] = {{10,20,30},{40,50,60},{70,80,90},{100,110,120}};
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=1;c<a[r].length-1;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}

	}

}
