package caps_14_shad;

public class Print_1to10_Except_5 {

	public static void main(String[] args) {
		
//Q2. WAP to print all the numbers between 1 and 10 except for the number 5. 
//		Use the continue statement to skip the number 5.

		int i = 1;
		int n = 10;
		
		while(i <= n)
		{
			if(i == 5)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
