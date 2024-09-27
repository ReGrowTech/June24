package capsule_21_bySweety;

import java.util.Scanner;

public class Usee_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
