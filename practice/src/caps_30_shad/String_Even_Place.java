package caps_30_shad;

public class String_Even_Place {

	public static void main(String[] args) {
		
//WAP to print all the even places value in a String.
		
		String s = "Shadab";
		char arr[] = s.toCharArray();
		
		System.out.println("Even places in string");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(arr[i] + " ");
			}
		}

	}

}
