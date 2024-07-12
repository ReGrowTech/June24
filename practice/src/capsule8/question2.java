package capsule8;
import java.util.Scanner;
public class question2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st number");
	int n1 = sc.nextInt();
	System.out.println("enter 2nd number");
	int n2= sc.nextInt();
	System.out.println("enter 3rd number");
    int n3 = sc.nextInt();
//    String result = (n1>n2 && n1>n3)?"n1 is greater":(n2>n3)?"n2 is greater":"n3 is greater";
//    System.out.println(result);
	
	if (n1>n2 && n1>n3)
	{
		System.out.println("n1 is greater");
	}
	else if ( n2>n3)
	{
		System.out.println("n2 is greater");
	}
	else {
		System.out.println("n3 is greater");
	}
	
	
	
	
	
	
	
	
	
}
}
