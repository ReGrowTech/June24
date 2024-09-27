package capsule_27_bySweety;

public class Greatest_3 {

	public static void main(String[] args) {

		Greatest_3 obj =new Greatest_3 ();
		int a= 12;
		int b= 456;
		int c= 56 ;
		
		int result  =obj.Display_Greatest(a,b,c);
		System.out.println(result  +" is greatest result ");
	}
	public int  Display_Greatest(int a, int b, int c)
	{
		if (a > b && a > c)
		{
            return a;
        } 
		else if (b > a && b > c)
		{
            return b;
        } 
		else
		{
            return c;
        } 
		
	}

}
