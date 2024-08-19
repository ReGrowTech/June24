package unit_test_07_shad;

public class FInding_Element_Array {

	public static void main(String[] args) {
		
//Q11. WAP in java take static array and check whether 10 is in the array or not. Print appropriate Message.
		
		int arr[] = {10, 42, 38, 25, 10, 65};
		int search = 10;
		
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
			System.out.println(search + " is found");
		}
		else
		{
			System.out.println(search + " is not found");
		}
		
		System.out.println("No.of searching element : " + cnt);
	}

}
