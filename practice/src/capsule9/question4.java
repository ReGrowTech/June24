package capsule9;
import java .util.Scanner;
public class question4 {
public static void main(String[]args) {
	System.out.println("enter 1st number");
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	System.out.println("Enter 2nd number ");
	int a = sc.nextInt();
	while(n<=a)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
			
		
		n++;
	}
}
}
