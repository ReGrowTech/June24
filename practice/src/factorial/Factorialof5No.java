package factorial;

public class Factorialof5No {

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		int fact = 1;
		
		while(a<=b)
		{
			fact = fact*a;
			a++;
		}
		System.out.println(fact);
	}

}
