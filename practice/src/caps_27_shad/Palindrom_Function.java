package caps_27_shad;

public class Palindrom_Function {

//WAP to check whether a number is Palindrome or not using non static function.
	
	public static void main(String[] args) {
		
		int n = 143;
		int revs = Palindrom_Function.reverse(n);
		
		Palindrom_Function obj = new Palindrom_Function();
		obj.checking(n , revs);
		
	}
	
	
	public static int reverse(int a)
	{
		int ld;
		int rev = 0;
		
		while(a > 0)
		{
			ld = a % 10;
			a = a / 10;
			rev = (rev * 10) + ld;
		}
		
		return (rev);
	}
	
	
	
	public void checking(int n , int rev) 
	{
		if(n == rev)
		{
			System.out.println(n + " is a Palindrome");
		}
		else
		{
			System.out.println(n + " is not a Palindrome");
		}
	}

}
