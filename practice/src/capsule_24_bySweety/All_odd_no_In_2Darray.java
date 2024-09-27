package capsule_24_bySweety;

public class All_odd_no_In_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= { {3,2},{4,1} ,{5,9} };
		
		for(int r=0;r<arr.length ;r++)
		{
			for(int c=0;c<arr[r].length ;c++)
			{
				if(arr[r][c]%2!=0)
				{
					System.out.print(arr[r][c]);
				}
						
			}
			System.out.println();
		}
	}

}
