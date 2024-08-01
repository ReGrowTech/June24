package unit_test_5;

public class Even_Num_Do_While {

	public static void main(String[] args) {
		
// Q15. Write a program to print all the even numbers using do while loop. 
		
		int a = 1;
		int b = 20;
		
		System.out.println("Even number between 1-20 are");
		
		do {
			if(a % 2 == 0)
			{
				System.out.println(a);
			}
			a++;
		}
		while(a <=b);

	}

}
