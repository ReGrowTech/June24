package while_loop;

public class Divisible_By {

	public static void main(String[] args) {
	
// WAP to print all the numbers which is divisible by from 1-20.
		
		int m = 1;
		while (m <=20)
		{
			if(m % 5 == 0)
			{
				System.out.println(m);
			}
				
			m++;
		}

	}

}
