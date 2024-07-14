package practiceattempt;
import java.util.*;
public class whileloops {
public static void main(String[]args) {
Scanner sc = new Scanner (System.in);
System.out.println("enter the value");
int n= sc.nextInt();
int ld;
int rev=0;
int n1 =n;
while(n>0)
{
	ld=n%10;
	n=n/10;
	rev=(rev*10)+ld;
}
System.out.println(rev);
if(n1==rev)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}





















}
}
