package caps_24_shad;

public class Searching_2D_Array {

	public static void main(String[] args) {
		
//5. WAP to to search if any particular number is present in the 2D Array or not.
		
		int arr[][] = { {2,3}, {8,1}, {5,2}, {7,3}, {10, 17} };
		int search = 2;
		boolean is_found = false;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				if(arr[i][j] == search)
				{
					is_found = true;
					break;
				}
			}
			
			if(is_found == true)
			{
				break;
			}
		}
		
		if(is_found == true)
		{
			System.out.println(search + " is found");
		}
		
		else
		{
			System.out.println(search + " is not found");
		}

	}

}
