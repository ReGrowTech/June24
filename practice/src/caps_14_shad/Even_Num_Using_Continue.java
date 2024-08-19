package caps_14_shad;

public class Even_Num_Using_Continue {

	public static void main(String[] args) {
				
//Q3. WAP to print all the even no between 1-20 using Continue.
	
		int n = 1;
		int i = 20;
		
		System.out.println("The even numbers are between 1-20");
		
		while(n <= i)
		{
			if(n % 2 != 0)
			{
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
	}

}
