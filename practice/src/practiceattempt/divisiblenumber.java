package practiceattempt;
import java.util.*;
public class divisiblenumber {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the vaalue");
int n = sc.nextInt();
int ld;
int rev =0;
while(n>0)
{
	ld=n%10;
	n=n/10;
	rev=(rev*10)+ld;
}
System.out.println(rev);


}
}
