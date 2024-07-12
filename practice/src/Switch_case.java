
public class Switch_case {
public static void main (String[]args) {

System.out.println("Enter '+' for add, '-' for subtract, '*' for multiply, '/'for divide");
int a= 5;
int b= 2;
char option='/';
int output;
switch(option)
{
case '+':
output=a+b;
System.out.println("the output is:" + output);
break;
case '-':
output=a-b;
System.out.println("the output is: " + output);
break;
case '*':
output=a*b;
System.out.println("the output is :" + output);
break;
case'/':
float result = (float) a/b;
System.out.println("the output is: " + result);
deafault:
	System.out.println("invalid operation");

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
