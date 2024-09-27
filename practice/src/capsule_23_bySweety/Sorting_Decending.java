package capsule_23_bySweety;

public class Sorting_Decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,3,1,6,8};
		for(int i=0;i< arr.length ;i++)
		{
			
			for(int j=i;j< arr.length ;j++)
			{
				if(arr[i]<arr[j])
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
