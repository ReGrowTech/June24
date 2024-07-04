package aditi_practice;

public class ConstructorChaining {
	
	public ConstructorChaining()
	{
		System.out.println(" Special Method 1 ");
	}
	
	
	public ConstructorChaining(int a )
	{
		this();
		System.out.println(" Special Method 2 :-" + a);
	}
	public ConstructorChaining(String a , int b)
	
	{
		
		this(5);
		System.out.println(" Special Method 3 " + a + " " + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConstructorChaining sc = new ConstructorChaining("Aditi",1);


	}

}
