package caps_14_shad;

public class For_Loop_Even {

	public static void main(String[] args) {
		
//Q10. WAP to print all the even numbers between 1-20 using For Loop.

		int a = 20;
		
		System.out.println("The even numbers are" );
		
		for(int i = 1; i <= a; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}

}
