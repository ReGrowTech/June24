package program_practic_By_Sweety;

public class Factor_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Factor of "+i +" are");
			
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					
					System.out.println(j +" ");
					System.out.println();
				}
			}
		}
	}

}
