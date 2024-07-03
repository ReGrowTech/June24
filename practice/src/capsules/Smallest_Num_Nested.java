package capsules;

public class Smallest_Num_Nested {

	public static void main(String[] args) {
		
// Write a program to find the smallest of 3 numbers using Nested if-else .
		
		int x = 100;
		int y = 150;
		int z = 180;
		
		if (x<y)
		{
			if (x<z)
			{
				System.out.println("x is smallest : " +x);
			}
			
			else
			{
				System.out.println("z is smallest : " + z);
			}
		}
		
		else
		{
			if (y<z)
			{
				System.out.println("y is smallest : " + y);
			}
			
			else
			{
				System.out.println("z is smallest : " + z);
				
			}
		}

	}

}
