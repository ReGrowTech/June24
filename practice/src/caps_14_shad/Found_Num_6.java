package caps_14_shad;

public class Found_Num_6 {

	public static void main(String[] args) {
		
//Q1. WAP to find the number 6 between 1 and 10. If the number 6 is found, print "Number 6 found".
//	  and break out of the loop.
		
		int i = 1;
		int n = 10;
		
		while(i <= n)
		{
			if(i == 6)
			{
				System.out.println("Number 6 is found");
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
