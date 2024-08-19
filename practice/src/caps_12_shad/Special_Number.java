package caps_12_shad;

public class Special_Number {

	public static void main(String[] args) {
		
//5.WAP to Check whether the given number is Special Number or not.
		
		int num = 145;
		int num2= num;
		int ld;
		int sum = 0;
		
		while(num >0)
		{
			ld = num % 10;
			num = num / 10;
			
			int i = 1 ;
			int fact = 1;
			
			while(i <= ld)
			{
				fact = fact * i;
				i++;
			}
			
			sum = fact + sum;
		}
		
		if(sum == num2)
		{
			System.out.println("Its a Special/KM number");
		}
		
		else
		{
			System.out.println("Its not a Special/KM number");
		}
		

	}

}
