package array2D_high_Priority_Questions_By_Sweety;

public class Element_Search_in_2Darray {

	public static void main(String[] args) {
		
		int a[][] = {{10,20,30},{40,50,60},{70,80,90},{100,110,120}};
		
		int search =20;
		boolean isFound =false ;
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(search==a[r][c])
				{
					isFound=true;
					break;
				}
			}
			
		}
		if(isFound==true)
		{
			System.out.println(search +" Found");
		}
		else
		{
			System.out.println(search +" not  Found");
		}

	}

}
