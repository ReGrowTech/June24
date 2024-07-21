package caps_XII;

public class Factorial_Even_Num {

	public static void main(String[] args) {
		
//4. WAP to find the factorial of all even numbers between 2-10.
		
		int start = 2;
		int end = 10;
		
		
		while(start <= end)
		{
			if(start % 2 == 0)
			{
				int fact = 1;
				int i = 1;
				
				//System.out.println("Factorial of number "+ start);
				
				while(i <= start)
				{
					fact = fact * i;
					i++;
				}
				
				//System.out.println(fact);
				
				System.out.println("Factorial of " + start + " number is " + fact);
			}
			
			start++;
		}
		
		
		
		
		
		        
	

		

	}
}

