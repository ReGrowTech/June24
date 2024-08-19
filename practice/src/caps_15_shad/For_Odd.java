package caps_15_shad;

public class For_Odd {

	public static void main(String[] args) {
		
//Q3. WAP to print all the odd numbers between 1-20 suing for loop.
		
	int m = 20;
		
		System.out.println("The odd numbers are");
		
		for(int i = 1 ; i <= m ; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}


	}

}
