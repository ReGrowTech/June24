package caps_21_shad;

public class Table_2_DyanamicArray {

	public static void main(String[] args) {
		
//3. WAP to create a Dynamic Array and print the Table of 2. 
		
		int arr[] = new int[10];
		
		for(int i = 1 ; i <= arr.length ; i++)
		{
			arr[i - 1] = i * 2;
		}
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(2 + " X " + (i+1) + " = " +  arr[i]);
		}

	}

}
