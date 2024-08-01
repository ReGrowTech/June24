package unit_test_5;

public class Finding_Num4_Using_Break {

	public static void main(String[] args) {
		
// Q14. Write a program to find the number 4 between 2 to 20. If found print "4 is found" and break out of the loop.
		
		int b = 20;
		
		for(int a = 1 ; a <= b ; a++)
		{
			if(a == 4)
			{
				System.out.println("4 is found");
				break;
			}
			
			System.out.println(a);
		}

	}

}
