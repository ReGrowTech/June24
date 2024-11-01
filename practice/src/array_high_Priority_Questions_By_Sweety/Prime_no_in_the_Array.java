package array_high_Priority_Questions_By_Sweety;

public class Prime_no_in_the_Array {

	public static void main(String[] args) {
		
		int arr[]= {5,7,9,3,9,91,47};
		
		for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Yes i dit it ");

	}

}
