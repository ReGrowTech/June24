package array_shad;

public class Element_Finding {

	public static void main(String[] args) {
		
		int arr[] = {2, 5, 8, 9, 7 , 7};
		int search = 7;
		
		boolean is_found = false;
		int cnt = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == search)
			{
				is_found = true;
				cnt++;
			}
		}
		if(is_found == true)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		System.out.println("No. of element : " + cnt);
	}

}
