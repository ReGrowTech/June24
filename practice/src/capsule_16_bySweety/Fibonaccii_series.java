package capsule_16_bySweety;

public class Fibonaccii_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 0 1 1 2 3 5 8 13  fibonacci series 
		
		int a= 0 ;
		int b= 1;
		System.out.print(a + " "+b +" ");
		
		int nth = 8 ;
		for(int i = 1 ; i<= nth-2 ;i++)
		{
		   int c = a+b ;
		   System.out.print(c +" ");	
		   a=b ;
		   b=c;
				   
		   
		}
	}

}
