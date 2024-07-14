package practiceattempt;
import java.util.Scanner;
public class palindrome {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);	
System.out.println("enter the value");

int d = sc.nextInt();
int ld;
int rev = 0;
int d1=  d;
while(d>0)
{
	ld=d%10;
	d=d/10;
	rev=(rev*10)+ld;
}
System.out.println(rev);
if(d==rev)
{
	System.out.println("palindrome");

}
else
{
	System.out.println("not a palindrome");

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
