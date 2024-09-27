package capsule_21_bySweety;

public class Sorting {

	public static void main(String[] args) {
		// accending 
		
		int arr [] = {5,3,1,6,8};
		for(int i=0;i< arr.length ;i++)
		{
			
			for(int j=i;j< arr.length ;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp ;
				}
			}
		}
		for(int i =0 ; i<arr.length ;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
