package capsules;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter '+' for add, '-' for subtarct, '*' for multiply, '/' for divide");
		
		char choice = '/';
		int first_num = 40;
		int second_num = 20;
		
		int output;
		
		

		switch(choice)
		{
		
		case '+':
			
			output= first_num + second_num;
			System.out.println("The output is : " + output);
			break;
		
		case '-':
			
			output= first_num - second_num;
			System.out.println("The output is : " + output);
			break;
			
		case '*':
			
			output= first_num * second_num;
			System.out.println("The output is : " + output);
			break;
			
		case '/':
			
			if(second_num !=0)
			{
				output= first_num / second_num;
				System.out.println("The output is : " + output);
			}
			
			else
			{
				System.out.println("Error !... Denominator should not be 0");
			}
			break;
			
		default :
			System.out.println("Invalid operation");
		}
	}

}
