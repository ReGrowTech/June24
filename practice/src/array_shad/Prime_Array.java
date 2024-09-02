package array_shad;

public class Prime_Array {

	public static void main(String[] args) {
		
// 2. WAP to Print all the prime numbers in an array. 
		
		int arr[] = {5, 6, 11, 32, 29, 7, 13, 10, 2};
		
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
				System.out.print(arr[i] + " ");
			}
		}
	

	}

}
