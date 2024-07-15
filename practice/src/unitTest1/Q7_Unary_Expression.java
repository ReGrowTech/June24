package unitTest1;

public class Q7_Unary_Expression {
	public static void main(String args[])
	{
		 int x = 8;
		 int a = x++ + ++x + x-- + --x + x++ + x-- + ++x;          
		 System.out.println(a);
		 System.out.println(x);
	}
}
