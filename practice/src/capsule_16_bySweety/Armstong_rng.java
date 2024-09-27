package capsule_16_bySweety;

public class Armstong_rng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ed =200;
		for(int str =100 ;str <= ed ;str++)
		{
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
			 for(int i =1;i<=cnt ;i++ )  //imp concept
			  {
				 
			    pow= pow *ld ;
			    
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

}
