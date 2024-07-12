
public class leapyear {

	public static void main(String[] args) {
		
	System.out.println("enter '+' for add, '-' for subtract, '*' for multiply, '/' for divide");
	int n1 = 40;
	int n2 =20;
	char choice = '*';
	int output;
	switch(choice)
	{
	case '+':
	output=n1+n2;
	System.out.println("the output is :" + output);
	break;
	
	case '-':
	output= n1-n2;
	System.out.println("the output is :" + output);
	break;
	
	case '*':
	output=n1*n2;
	System.out.println("the output is :" + output);
	break;
	
	case '/':
	float result= (float)n1/n2;
	System.out.println("the output is :" + result);
	default:
		System.out.println("invalid operation");
	}

}

}
