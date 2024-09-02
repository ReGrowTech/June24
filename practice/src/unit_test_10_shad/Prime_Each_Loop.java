package unit_test_10_shad;

public class Prime_Each_Loop {

	public static void main(String[] args) {
	
//Q3 WAP in java using for each loop and print all the prime numbers in a static array. 
		
		int arr[] = {2, 1, 4, 7, 9, 17, 31};
		
		System.out.println("Prime numbers are ");
		
		for(int val : arr)
		{
			int cnt = 0;
			
			for(int i = 1 ; i <= val ; i++)
			{
				if(val % i == 0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
			{
				System.out.print(val + " ");
			}
		}
	}

}
