package capsule_16_bySweety;

public class Normal_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int str =153 ;
		int num1= str;
		int num2= str;
		int cnt =0;
		// count ;
		while (num1>0 )
		{
			num1= num1/10 ;
			cnt++ ;
		}
		
		// last digit ,  sum 
		int ld ;
		int sum =0 ;
					
		while (num2>0)
		{
		 ld = num2%10 ;
		 num2 = num2/10 ;
		 
		 //power concept 
		 int pow = 1 ;
		 int i =1;
		 while(i<=cnt)  //imp concept
		  {
			 
		    pow= pow *ld ;
		    i++ ;
		  }
		 sum = sum+ pow ;
		}
		
		if(str==sum)
		{
			System.out.println(str+ " Armstrong no _________________ ");
		}
		else
		{
			System.out.println(str+ " not an Armstrong no ");
		}
	}

}
