package capsule_21_bySweety;

import java.util.Scanner;

public class Dynamic_arr_1_5 {

	public static void main(String[] args) {
        
		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter the values of array ");
		int arr [] =new int [5];
		
		
		for(int i=0;i< arr.length ;i++)
		{
			arr[i] =sc.nextInt() ;
			
		}
		for(int i=0;i< arr.length ;i++)
		{
			System.out.println(arr[i]);
			
		}
	}

}
