package capsule_24_bySweety;

public class Element_Search_In_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= { {3,2},{4,1} ,{5,9} };
		
		int search = 4 ;
		boolean isFound =false ;
		
		for( int r=0 ;r<arr.length ;r++)
		{
			for( int c=0 ;c<arr[r].length ;c++)
			{
				if(search== arr[r][c])
				{
					isFound =true;
					break ;
				}
			}
		}
		if(isFound == true)
		{
			System.out.println(search+" is found  ");
		}
		else
		{
			System.out.println(search+" is  not found  ");
		}
	}

}
