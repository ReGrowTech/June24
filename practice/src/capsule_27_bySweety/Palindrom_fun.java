package capsule_27_bySweety;

public class Palindrom_fun {

	public static void main(String[] args) {
		Palindrom_fun ob = new Palindrom_fun();
		int n= 151;
		
		// calling from reverse here class is non static 
		// it return rev value which is store in rev_val ;
		int rev_val =ob.reverse(n);
		
		//calling from display which  no static function 
		// does not return value 
        ob.display(n, rev_val); // it have 2 parameter passed 
	}
	// non static 
	public int reverse(int n)  // 1 Parameter pass
	{
		int ld ;
		int rev=0;
		
		while(n>0)
		{
			ld =n%10;
			n=n/10;
			rev = (rev*10)+ld ;
		}
		return rev ;
	}
	public void display (int n,int rev )// 2 Parameter pass
	{
		if(n==rev)
		{
			System.out.println(n+ " is a  palindrome number  ");
		}
		else
		{
			System.out.println(n+ " is not a  palindrome number  ");
		}
	}

}
