package array_high_Priority_Questions_By_Sweety;

public class Array_find_the_Frequency_Count_of_the_values_input {

	public static void main(String[] args) {
		
		int arr[]= {5,7,9,36,75,3,9,90,40,37,98,40,52};
		
		for (int i=0;i<arr.length;i++)
		{
			int cnt=1;
			if(arr[i]!=Integer.MAX_VALUE)
			{
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						arr[j]=Integer.MAX_VALUE;
					}
				}
				System.out.println(arr[i]+"-------------- "+cnt);
			}
			
		}
		System.out.println("\n  yes i did it ");

	}

}
