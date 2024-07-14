package practiceattempt;
import java.util.*;
public class divisblenumber {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st number");
int n = sc.nextInt();
System.out.println("enter 2nd number");
int d= sc.nextInt();
while(n<=d)
{
	if(n%3==0)
	{
		System.out.println(n);
	}
	n++;
}
}

}
