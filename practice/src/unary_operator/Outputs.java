package unary_operator;

public class Outputs {
public static void main(String args[]) {
	int x = 3;
	int c = x++ + x++ + ++x + ++x + x++ + x++ + ++x;
	
	int x1 = 2;
	int c1 = x1++ + ++x1 + ++x1 + x1++ + x1++ + ++x1 + x1++;
	
	
	System.out.println(x);
	System.out.println(c);
	System.out.println(x1);
	System.out.println(c1);
}
}
