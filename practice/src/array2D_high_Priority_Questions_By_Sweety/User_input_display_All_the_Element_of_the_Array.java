package array2D_high_Priority_Questions_By_Sweety;

import java.util.Scanner;

public class User_input_display_All_the_Element_of_the_Array {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a row");
		int row =sc.nextInt();
		
		System.out.println("Enter a column");
		int col =sc.nextInt();
		
		int a[][]= new int [row][col];
		
		System.out.println("Enter the array Element ");
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		
		System.out.println("\n Printing the Element of the array ");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+ "  ");
			}
			System.out.println();
		}
		
		

	}

}
