package unit_test_08_shad;

public class Prime_Array {

	public static void main(String[] args) {
		
//Q7. WAP to print all the prime numbers in an Array.
		
		int arr [] = {11, 6, 2, 7, 5, 9, 31};
		
		System.out.println("Prime numbers are ");
		 
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
