
public class revisionforallcapsule {
public static void main(String[]args) {
	int n1=565;
	int n2= 665;
	int n3= 132;
	
	if(n1>n2 && n1>n3)
	{System.out.println(n1 +"is greater");
	
	}
	else if(n2>n3)
	{
		System.out.println(n2 + "is greater");
	}
	else
	{
		System.out.println(n3 + "is greater");
}
	
	
	
	
	
	
	int a = 6;
	int b =43;
	int c= 65;
	
	if(a<b)
	{
	if(a<c)
	{
		System.out.println(a + "is smaller");
	}
	else
	{
		System.out.println(c + "is a smaller");
	}
	}
	else if(b<c)
	{
		System.out.println(b + "is smaller");
	}
	else
	{
		System.out.println(c + " is smaller");
	}

	
	
	
	int year = 2024;
	if((year%400==0 && year%100==0)||(year%4==0 && year%100!=0))
	{
		System.out.println(2024 + "is a leap year");
		
	}
	else
	{
		System.out.println(2024 + "is not a leap year");
	}
	
	
	int yr= 1900;
	if(yr%400==0 && yr%100==0)
	{
		System.out.println("its a leap year");
		
	}
	else if(yr%4==0 && yr%100!=0)
	{
		System.out.println("its not a leap year");
	}
	else
	{
		System.out.println("its not a leap year");
	}
	
	
	
	int years = 2000;
	String res= ((years%400==0 && years%100==0)||(years%4==0 && years%100!=0))? "leap year":"not a leap year";
	System.out.println(res);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

} 
