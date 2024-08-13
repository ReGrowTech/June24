package unit_test_7;

public class Prime_Array {

	public static void main(String[] args) {
		
//Q13.WAP in Java to print all the Prime Numbers in an Array.
		
		int arr [] = {2 , 77, 29, 13, 52, 1, 31};
		
		System.out.println("Prime numbers are \n");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int cnt = 0;
			
			for(int j = 1 ; j <= arr[i] ; j++)
			{
				if(arr[i] % j == 0)
				{
					cnt++;
				}
			}
			
			if(cnt == 2)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
