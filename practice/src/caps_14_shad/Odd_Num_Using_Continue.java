package caps_14_shad;

public class Odd_Num_Using_Continue {

	public static void main(String[] args) {
		
//Q4. WAP to print all the odd no between 1-20 using Continue.
		
		int i = 1;
		int n = 20;
		
		System.out.println("The odd numbers are between 1-20");
		
		while(i <= n)
		{
			if(i % 2 == 0)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
