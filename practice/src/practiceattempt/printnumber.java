package practiceattempt;
import java.util.*;
public class printnumber {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the 1st value");
int a = sc.nextInt();
System.out.println("enter the 2nd value");
int b = sc.nextInt();
char ch = '/';
int output;
switch(ch)
{
case '+':
output=a+b;
System.out.println("the output is"+output);
break;

case '-':
output=a-b;
System.out.println("the output is"+output);
break;

case'*':
output=a*b;
System.out.println("the output is"+output);
break;

case '/':
double res = (double)a/b;
System.out.println("the output is"+res);
break;

default:
	System.out.println("invalid number");
}
	
	
	
}
}
