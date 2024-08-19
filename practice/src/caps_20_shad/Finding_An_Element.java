package caps_20_shad;

public class Finding_An_Element {

	public static void main(String[] args) {
		
//9. WAP to search 4 is present in the array or not.? Print appropriate message.
		
		int arr[] = {10, 2, 4, 5, 11,8, 9};
		int search = 4;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == search)
			{
				System.out.println(arr[i] + " Found");
				break;
			}
			else
			{
				System.out.println("Not Found");
			}
		}
	}

}
