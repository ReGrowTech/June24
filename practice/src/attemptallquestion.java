
public class attemptallquestion {
public static void main(String[]args){
	
//Q: what will happen if we convert char into int.
	char z = 'z';
	int b = 'h';
	System.out.println(b);
	
	
//Q write a program to divide 2 number and prints its quotient and reminder same as ternary method?
	
	int a = 25;
	int c = 6;
	float quotient = (a/c);
	int reminder = (a%c);
	System.out.println(quotient);
    System.out.println(reminder);
	
	
//  Q wap to print the greater of 2 number using ternary operator
    int m1 = 134;
    int m2 = 46;
    String result = (m1>m2)? "greater number":"smaller number";
    System.out.println(result);
	
    
//    WAP to print the number is even or odd using ternary operator;
	int a1 = 22;
	String res = (a1%2==0)? "even number":"odd number";
	System.out.println(res);
	
	
	
//	Q WAP to print the greater of 2 number using if else
	int n1 = 867;
	int n2 = 76;
	if(n1>n2)
	{
	System.out.println(n1 + " is greater number");
	}
	else
	{
	System.out.println(n2 + " is greater number");
	}
	
//	WAP to print the number is even or odd using if else
	int num= 33;
	if (num%2==0)
	{
	System.out.println(num + " the number is even number");
	}
	else 
	{
		System.out.println(num + " number is odd number");
	}
	
	
//	WAP to print the greatest of 3 number using if else if else.
	int b1= 24;
	int b2= 34;
	int b3= 65;
	if(b1>b2 && b1>b3)
	{
	System.out.println(b1 + " is greater");
	
	}
	else if(b2>b3)
	{
		System.out.println(b2 + " is greater");
	}
	else 
	{
		System.out.println(b3 + " is greater");
	}
	
	int c1 = 345;
	int c2 = 458;
	int c3 = 65;
	if(c1>c2)
	{
	if(c1>c3)
	{
		System.out.println(c1 + " is greater");
	}
	else
	{
		System.out.println(c3 + " is greater");
	}
	}
	else if(c2>c3)
	{
	System.out.println(c2 + " is greater");
	
	}
	else
	{
		System.out.println(c3 + " is greater");
	}
	
	System.out.println("enter '+' for add, '-' for subtract, '*' for multiply, '/' for divide");
	int f1 = 6;
	int f2 = 3;
	int output;
	char input= '*';
	switch(input)
	{
	case '+':
	output=f1+f2;
	System.out.println("the output is "+ output);
	break;
	case '-':
	output = f1-f2;
	System.out.println("the output is "+ output);
	break;
	case '*':
	output= f1*f2;
	System.out.println("the output is "+ output);
	break;
	case'/':
	double resultt=(double)f1/f2;
	System.out.println("the output is "+ resultt);
	break;
	default:
		System.out.println("invalid operation");
	}
	
	
	
//Q WAP to print the year is leap year using ternary operators
	
	int year = 1900;
	String results= (year%400==0 && year%100==0)||(year%4==0 && year%100!=0)? "leap years":"not a leap year";
	System.out.println(results);
	
	
	System.out.println("enter 'l' for light and 'f' for fan");
	char chance= 'l';
	switch(chance)
	{
	case 'f':
	System.out.println("switch on the fan");
	break;
	case 'l':
	System.out.println("switch on the light");
	break;
	default:
	System.out.println("invalid entry");
	}
	
	
//Q check the number is positive negative and zero
	int number = 101;
	if (number<0)
	{
	System.out.println("number is positive");
	}
	else if (number>0)
	{
	System.out.println("number is negative");
	}
	else
	{
	System.out.println("number is zero");
	}
	
	
	
	
	
	
	
	
}

}
