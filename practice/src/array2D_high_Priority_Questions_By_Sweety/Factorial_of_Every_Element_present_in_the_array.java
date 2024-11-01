package array2D_high_Priority_Questions_By_Sweety;

public class Factorial_of_Every_Element_present_in_the_array {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4},{5,2,3,6}};
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				int fact =1;
				for(int i=1;i<=a[r][c];i++)
				{
					fact= fact*i;
					
				}
				System.out.print(fact +" ");
			}
			System.out.println();
		}

	}

}
