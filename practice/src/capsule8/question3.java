package capsule8;
import java.util.*;
public class question3 {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st number");
int a = sc.nextInt();
System.out.println("enter 2nd number");
int b = sc.nextInt();
System.out.println("enter '+' for additin, '-' for subtract, '*' for multiply and '/' for divide");
int output;
char ch = '/';
switch (ch)
{
case '+':
output = a+b;
System.out.println("the output is "+output);
break;
case '-':
output= a-b;
System.out.println("the output is "+output);
break;
case '*':
output = a*b;
System.out.println("the output is "+output);
break;
case '/':
double res =(double) a/b;
System.out.println("teh output is"+ res);
break;
default:
	System.out.println("invalid number");
}
	
	
	
	
	
	
}
}
