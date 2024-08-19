package caps_13_shad;

public class Odd_Numbers {

	public static void main(String[] args) {
		
//3. WAP to print all the odd numbers between 100-1
		
		int i = 1;
		int j = 100;
		
		System.out.println("The odd numbers are");              
		while(i <= j)
		{
			if(j % 2 != 0)
			{
				System.out.println(j);
			}
			
			j--;
			
		}

	}

}
