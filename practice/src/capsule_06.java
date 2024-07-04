
public class capsule_06 {
public static void main(String[]args) {

//	WAP to find the greatest of 3 number using if else if else
	
	int n1 = 34;
	int n2 = 56;
	int n3 = 89;
	
	if (n1>n2 && n1>n3)
	{
		System.out.println(n1 + "is the greatest number");
	}
	else if(n2>n3)
	{
		System.out.println(n2 + " is the greatest number");
	}
	else
	{
		System.out.println(n3 + "is the greatest number");
	}
	
	
//	WAP to find the smallest of 3 number using nested if else
	
	int a1 = 123;
	int b2 =13;
	int c3 = 54;
	
	if(a1<b2)
	{
	if(a1<c3)
	{
		System.out.println(a1 + "is the smaller ");
	}
	else
	{
		System.out.println(c3 +"is the smaller");
	}
	}
	else if(b2<c3)
	{
		System.out.println(b2 + "is the smaller");
	}
	else
	{
		System.out.println(c3 + " is the smaller");
	}
	
//	WAP to find whether the given character is alphabet , digit and a special character.
	
	char ch = '8';
	 
	if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
	{
		System.out.println("its a alphabet");
	}
	else if (ch>='0' && ch<='9')
	{
		System.out.println("its a number");
	}
	else
	{
		System.out.println("its a alphabet");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
