package capsule_15_bySweety;

public class Print_table_of_2 {
	
	public static void main(String args [])
	{
		int n= 2;
		int count =1 ;
		int i =1 ;
		while(i<=50)
		{
			if(i%5==0)
			{
				System.out.println(n +" X " + count + " = "+ (n*count));
				count++ ;
			}
			i++ ;
		}
	}

}
