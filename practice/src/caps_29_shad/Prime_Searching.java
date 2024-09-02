package caps_29_shad;

public class Prime_Searching {

	public static void main(String[] args) {
		
//2.WAP to find all the Prime Numbers in an array using for each loop.Print appropriate message if no prime numbers is found.

		int arr[] = {4, 6, 12, 30, 9};
		//int arr[] = {3, 5, 10, 8, 11};
		
		boolean found = false;
		
		for(int val : arr)
		{
			int cnt = 0;
			
			for(int i = 1 ; i <= val ; i++)
			{
				if(val % i == 0)
				{
					cnt ++;
				}
			}
			
			if(cnt == 2)
			{
				found = true;
				System.out.println(val);
			}
		}
		
		if(found == false)
		{
			System.out.println("No Prime Numbers are present in the array");
		}
	}

}
