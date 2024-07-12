

//WAP to find the greater of 3 number using if else if else


public class capsule06 {
public static void main(String[]args) {
int a = 56;
int b = 66;
int c = 77;
if(a>b && b>c)
{
	System.out.println('a'+ "is greater");
}
else if(b>c)
{
	System.out.println('b'+"is greater");
}
else
{
	System.out.println('c' + "is greater");
}


//System.out.println("enter '+' for add, '-' for subtract, '*' for multiply, '/' for divide");
//int n1=23;
//int n2=3;
//char choice = '/';
//int output;
//switch(choice)
//{
//case '+':
// output=n1+n2;
//System.out.println("the output is :"+output);
//break;
//case '-':
//output=n1-n2;
//System.out.println("the output is :"+output);
//break;
//case '*':
//output =n1*n2;
//System.out.println("the output is :"+output);
//break;
//case '/':
//output=n1/n2;
//System.out.println("the output is :"+ output);
//default:
//System.out.println("invalid operation");
//}


System.out.println("Enter'f' for fan an 'l' for light");
char choice = 'b';
switch(choice)
{
case 'l':
System.out.println("switch on the light");
break;
case 'f':
System.out.println("switch on the fan");
default:
System.out.println("invalid entery");

}








}
}