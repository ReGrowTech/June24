package capsule_16_bySweety;

public class Armstrong_no_100_200 
{

	public static void main(String[] args) {
		// 153 =1^3 +5^3+3^3= 1+125+27= 153

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
			 int i =1 ;
			 while (i<=cnt)
			 {
				 pow= pow *ld ;
				 i++ ;
			 }
			 sum = sum+ pow ;
			}
			
			if(str==sum)
			{
				System.out.println(str+ " Armstrong no ");
			}
			else
			{
				System.out.println(str+ " not an Armstrong no ");
			}
			
		}
	}

}
