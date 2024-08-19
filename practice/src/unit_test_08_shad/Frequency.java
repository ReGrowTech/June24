package unit_test_08_shad;

public class Frequency {

	public static void main(String[] args) {
		
//Q9. WAP to find the frequency of all the element present in an array?
		
		int arr[] = {2, 3 ,5, 10, 3, 1, 7, 2, 3, 1, 2, 5};
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int cnt = 1;
			
			if(arr[i] != Integer.MAX_VALUE)
			{
				for(int j = i+1 ; j < arr.length ; j++)
				{
					if(arr[i] == arr[j])
					{
						cnt++;
						arr[j] = Integer.MAX_VALUE;
					}
				}
				
				System.out.println(arr[i] + "---->" + cnt);
			}
			
		}

	}

}
