package practiceattempt;
import java.util.*;
public class divisibleby5 {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("1st value");
int d = sc.nextInt();
System.out.println("enter 2nd value");
int a = sc.nextInt();
while(d>=a)
{
	if(d%5==0)
	{
		System.out.println(d);
	}
 d--;
}

}
}
