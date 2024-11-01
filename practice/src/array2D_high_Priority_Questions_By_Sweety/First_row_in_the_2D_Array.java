package array2D_high_Priority_Questions_By_Sweety;

public class First_row_in_the_2D_Array {

	public static void main(String[] args) {

        int a[][] = {{10,20,30},{40,50,60},{70,80,90},{100,110,120}};
		
		for(int r=0;r<a.length-3;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}

}
