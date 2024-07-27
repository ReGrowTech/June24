package unitTest1;

public class Q11_Unary_Expression {
	public static void main(String args[])
	{
		 int z = 10;
	     int c = z-- + ++z + z++ + --z + z-- + ++z + --z;          
		 System.out.println(z);
		 System.out.println(c);
	}

}
