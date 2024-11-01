package array_high_Priority_Questions_By_Sweety;

public class Print_multiplication_Array {

	public static void main(String[] args) {
		
		int arr[]= new int [10];
		int n=5;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(i+1)*n;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println	(arr[i]+" ");
		}
		System.out.println(" Yes i did it ");

	}

}
