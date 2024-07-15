package cap_5;

public class Q1_a_UnaryExp {
public static void main(String args[]) {
	int x = 3;
	int z = ++x + ++x  + x++ + ++x + x++;
	System.out.println(x);
	System.out.println(z);
}
}
