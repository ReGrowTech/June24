package caps_26_shad;

public class Functions_Even_For_Loop {

//2. WAP in java using Functions and print all the even numbers from 1-100. 
	
	public static void main(String[] args) {

		System.out.println("Even numbers are");
		
		for(int i = 1 ; i <= 100 ; i++)
		{
			Functions_Even_For_Loop.even(i);
		}
		

	}
	
	public static void even(int n) {
		
		
		if(n % 2 == 0)
		{
			System.out.println(n);
		}
	}

}
