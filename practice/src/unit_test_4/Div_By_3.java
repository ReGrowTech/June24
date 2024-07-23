package unit_test_4;

public class Div_By_3 {

	public static void main(String[] args) {
		
// Q7. Write a program to find all the numbers between 20 - 40 and check whether the number is divisible by 3. 
		
		int i = 20;
		int j = 40;
		
		System.out.println("The numbers which are divisible by 3");
		while(i <= j)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
			}
			i++;
		}

	}

}
