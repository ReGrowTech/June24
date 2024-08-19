package caps_15_shad;

public class For_Even {

	public static void main(String[] args) {
		
//Q2. WAP to print all the even numbers between 1-20 suing for loop. 
		
		int n = 20;
		
		System.out.println("The even numbers are");
		
		for(int i = 1 ; i <= n ; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}

}
