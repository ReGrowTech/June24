
public class practice_till_now {
public static void main(String[]args) {

	
	String name = "shakir@";
	int age = 18;
	System.out.println(name+(age+5));
	
	
	char ch = 'z';
	int y='c';
	System.out.println(y);
	
	int i = 256;
	String b= String.valueOf(i);
	System.out.println(b);
	
	int z = 10;
	int c = z-- + ++z + z++ + --z + z-- + ++z + z++ + --z;
	System.out.println(z);
	System.out.println(c);
	
	
	int n1 = 345;
	int n2 = 45;
	String res=(n1>n2)? "greatest":"smallest";
	System.out.println(res);
	
	
	
	int yr = 1900;
	String result = ((yr%400==0 && yr%100==0)||(yr%4==0 && yr%100!=0))? "leap year":"not a leap year";
	System.out.println(result);
	
	
	
	int a1 = 46;
	
	if(a1%2==0)
	{
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}
	
	
	
	
	
	char a = '$';
	if(a>='A' && a<='Z')
	{
		if(a>='a' && a<='z')
	{
			System.out.println("its a alphabet");
	}
		else
	{
		System.out.println("its a special character");	
	}
	}
	else if(a>='0' && a<='9')
	{
		System.out.println("its a digit");
	}
	else
	{
		System.out.println("its a alphabet");
	}
	
	
	int m1 = 5;
	int m2= 2;
	System.out.println("Enter operation for" '+' for add and '-' for subtract and '*' for multiply and '/' for division);
	System.out.println("i'll use operation:"+option+ for this program");		
	char option = '/';
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
