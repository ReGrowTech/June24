package string;

public class String_Even_Index {

	public static void main(String[] args) {
		
//WAP to print all the even indexes value in a String.
		
		String arr[] = {"Hussain ", "Alia", "Shadab", "Dulquar", "Inaaya"};
		
		for(int i = 0 ; i <arr.length ; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}

		}

	}
}
