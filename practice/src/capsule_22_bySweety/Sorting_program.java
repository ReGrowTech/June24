package capsule_22_bySweety;

public class Sorting_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {5,3,1,6,8}; 
		for(int i=0;i< arr.length ;i++)
		{
			
			for(int j=i;j< arr.length ;j++)
			{
				if(arr[i]>arr[j])// ascending 
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp ;
				}
			}
		}
		
		
		System.out.println((arr[arr.length-1]) +" Greatest value ");// 
	}

}
